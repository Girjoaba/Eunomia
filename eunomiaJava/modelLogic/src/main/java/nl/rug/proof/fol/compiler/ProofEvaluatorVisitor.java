package nl.rug.proof.fol.compiler;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.antlrAPI.ProofGrammarBaseVisitor;
import nl.rug.proof.fol.antlrAPI.ProofGrammarParser;
import nl.rug.proof.fol.compiler.manager.Manager;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * A visitor class responsible for compiling the proof and checking the validity of each proof line.
 */
@Slf4j
public class ProofEvaluatorVisitor extends ProofGrammarBaseVisitor {

    private final Manager manager;

    public ProofEvaluatorVisitor(Manager manager) {
        this.manager = manager;
    }

    /**
     * When visiting subproofs we must visit all the elements of the subproof. Be them proof lines or other subproofs.
     * @param ctx the parse tree
     */
    @Override
    public Object visitSubproof(ProofGrammarParser.SubproofContext ctx) {
        for(ParseTree tree : ctx.children) {
            visit(tree);
        }
        return null;
    }

    /**
     * In an assumption we normally visit the proof line associated with it but also increase the level.
     * The level is a way to keep track of the subproof.
     * For example, you can not use a sentence from inside a subproof unless it is associated to a rule specifically.
     * @param ctx the parse tree
     */
    @Override
    public Object visitAssume(ProofGrammarParser.AssumeContext ctx) {
        manager.increaseLevel();
        visit(ctx.premiseLine());
        return null;
    }

    /**
     * We visit the associated proof line but also decrease the level by 1 afterwards.
     * @param ctx the parse tree
     */
    @Override
    public Object visitQed(ProofGrammarParser.QedContext ctx) {
        visit(ctx.conclusionLine());
        manager.decreaseLevel();
        return null;
    }

    @Override
    public Object visitPremiseLine(ProofGrammarParser.PremiseLineContext ctx) {
        manager.setCurrentLine((Integer) visit(ctx.proofLineNum()));
        visit(ctx.premiseInference());
        return null;
    }

    /**
     * The proof line is the building block of the proof. We extract the line number and begin visiting till we make sure
     * the proof line is valid.
     * @param ctx the parse tree
     */
    @Override
    public Object visitProofLine(ProofGrammarParser.ProofLineContext ctx) {
        manager.setCurrentLine((Integer) visit(ctx.proofLineNum()));
        visit(ctx.inference());
        return null;
    }

    @Override
    public Object visitConclusionLine(ProofGrammarParser.ConclusionLineContext ctx) {
        manager.setCurrentLine((Integer) visit(ctx.proofLineNum()));
        visit(ctx.inference());
        return null;
    }

    /**
     * The proof line number acts as an index to our proofs. We refer to this number when evaluating justifications.
     * @param ctx the parse tree
     * @return The proof line number as Integer
     */
    @Override
    public Integer visitProofLineNum(ProofGrammarParser.ProofLineNumContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    // TODO: Not implemented yet
    @Override
    public Object visitContradictionInfer(ProofGrammarParser.ContradictionInferContext ctx) {
        visit(ctx.contradiction(0));
        visit(ctx.justification());
        return null;
    }

    /**
     * To make sure an inference is valid we need to check if it follows from the previous sentences. To do that we
     * use the justification to get previous sentences and check if this line is valid.
     * @param ctx the parse tree
     */
    @Override
    public Object visitSentenceInfer(ProofGrammarParser.SentenceInferContext ctx) {
        visit(ctx.sentence(0));
        visit(ctx.justification());
        return null;
    }

    @Override
    public Object visitPremiseContradictionInfer(ProofGrammarParser.PremiseContradictionInferContext ctx) {
        visit(ctx.contradiction(0));
        return null;
    }

    @Override
    public Object visitPremiseSentenceInfer(ProofGrammarParser.PremiseSentenceInferContext ctx) {
        visit(ctx.sentence(0));
        return null;
    }

    /**
     * --------------------------------------- SPECIAL SENTENCES ---------------------------------------------
     */
    @Override
    public Object visitContradiction(ProofGrammarParser.ContradictionContext ctx) {
        manager.addProofLine(ctx);
        return null;
    }

    /**
     * An atomic sentence, we just store the atomic value.
     * @param ctx the parse tree
     */
    @Override
    public Object visitAtomic(ProofGrammarParser.AtomicContext ctx) {
        manager.addProofLine(ctx);
        return null;
    }

    @Override
    public Object visitNegation(ProofGrammarParser.NegationContext ctx) {
        manager.addProofLine(ctx);
        return null;
    }

    /**
     * A conjunction, we store the main connective for easier access and the sentence as a ParseTree.
     * @param ctx the parse tree
     */
    @Override
    public Object visitConjunction(ProofGrammarParser.ConjunctionContext ctx) {
        manager.addProofLine(ctx);
        return null;
    }

    /**
     * A disjunction, we store the main connective for easier access and the sentence as a ParseTree.
     * @param ctx the parse tree
     */
    @Override
    public Object visitDisjunction(ProofGrammarParser.DisjunctionContext ctx) {
        manager.addProofLine(ctx);
        return null;
    }


    /*
     * -------------------------------------- JUSTIFICATION STUFF ---------------------------------------------
     */

    /**
     * A reiteration justification, is just restating an antecedent sentence. We check if the sentences match.
     * @param ctx the parse tree
     */
    @Override
    public Object visitReiteration(ProofGrammarParser.ReiterationContext ctx) {

        Integer reference = (Integer) visit(ctx.singleReference());

        if(!manager.isValidSingleReference(reference)) {
            manager.setCurrentEvaluationWrong("Invalid reference.");
            return null;
        }

        if(!manager.getSentence(reference).getText().equals(manager.getCurrentSentence().getText())) {
            manager.setCurrentEvaluationWrong("Reiteration applied to different sentences.");
            return null;
        }
        return null;
    }

    @Override
    public Object visitContradictionIntro(ProofGrammarParser.ContradictionIntroContext ctx) {

        Integer reference1 = (Integer) visit(ctx.singleReference(0));
        Integer reference2 = (Integer) visit(ctx.singleReference(1));

        if(!manager.isValidSingleReference(reference1) || !manager.isValidSingleReference(reference2)) {
            manager.setCurrentEvaluationWrong("Invalid reference.");
            return null;
        }

        if(!manager.getCurrentSentence().getText().equals("\\perp")) {
            manager.setCurrentEvaluationWrong("Result not a contradiction.");
            return null;
        }

        if(!manager.getSentence(reference2).getChild(0).getText().equals("!") ||
                !manager.getSentence(reference1).getText().equals(manager.getSentence(reference2).getChild(1).getText())) {
            manager.setCurrentEvaluationWrong("Contradiction does not result from the premises. (maybe justification order is wrong ?)");
            return null;
        }
        return null;
    }

    @Override
    public Object visitContradictionElim(ProofGrammarParser.ContradictionElimContext ctx) {

        Integer reference = (Integer) visit(ctx.singleReference());
        if(!manager.isValidSingleReference(reference)) {
            manager.setCurrentEvaluationWrong("Invalid reference.");
            return null;
        }

        if(!manager.getSentence(reference).getText().equals("\\perp")) {
            manager.setCurrentEvaluationWrong("Contradiction elimination not applied to a contradiction.");
            return null;
        }

        return null;
    }

    @Override
    public Object visitNegationIntro(ProofGrammarParser.NegationIntroContext ctx) {

        String range1 = (String) visit(ctx.rangeReference());

        Integer rangeStart = Integer.parseInt(range1.split("-")[0]);
        Integer rangeEnd = Integer.parseInt(range1.split("-")[1]);

        if(!manager.isValidRangeReference(rangeStart, rangeEnd)) {
            manager.setCurrentEvaluationWrong("Invalid reference.");
            return null;
        }

        if(!manager.getSentence(rangeStart).getText().equals(manager.getCurrentSentence().getChild(1).getText())
                || !manager.getCurrentSentence().getChild(0).getText().equals("!")) {
            manager.setCurrentEvaluationWrong("The premise of the subproof is not negated as the result of the negation");
            return null;
        }

        if(!manager.getSentence(rangeEnd).getText().equals("\\perp")) {
            manager.setCurrentEvaluationWrong("Subproofs does not end in a contradiction.");
            return null;
        }

        return null;
    }

    @Override
    public Object visitNegationElim(ProofGrammarParser.NegationElimContext ctx) {

        Integer reference = (Integer) visit(ctx.singleReference());

        if(!manager.isValidSingleReference(reference)) {
            manager.setCurrentEvaluationWrong("Invalid reference.");
            return null;
        }

        if(!manager.getSentence(reference).getChild(0).getText().equals("!")
                || !manager.getSentence(reference).getChild(0).getChild(0).getText().equals("!")) {
            manager.setCurrentEvaluationWrong("Can only apply negation elimination to double negations.");
            return null;
        }

//        if(!manager.getSentence(reference).getChild(0).getChild(0).getChild(0).getText().
//            equals(manager.getCurrentSentence().getText())) {
//            manager.setCurrentEvaluationWrong("The inferred sentence is not the same as the double negation.");
//            return null;
//        }

        return null;
    }

    /**
     * A conjunction introduction looks at the referred sentences applying the conjunction binary operation in
     * between them.
     * @param ctx the parse tree
     */
    @Override
    public Object visitConjunctionIntro(ProofGrammarParser.ConjunctionIntroContext ctx) {

        Integer reference1 = (Integer) visit(ctx.singleReference(0));
        Integer reference2 = (Integer) visit(ctx.singleReference(1));

        if(!manager.isValidSingleReference(reference1) || !manager.isValidSingleReference(reference2)) {
            manager.setCurrentEvaluationWrong("Invalid reference.");
            return null;
        }

        if(!manager.isCurrentCorrectBinaryExpression("&&")) {
            manager.setCurrentEvaluationWrong("Inferred sentence is not a conjunction.");
            return null;
        }

        if(!manager.isPartOfCurrentBinaryExpression(reference1) || !manager.isPartOfCurrentBinaryExpression(reference2)) {
            manager.setCurrentEvaluationWrong("Inferred Conjunction not constructed from referred sentences.");
            return null;
        }
        return null;
    }

    /**
     * A conjunction elimination refers to a previous conjunction and checks if the inferred sentence is one of the
     * conjuncts.
     * @param ctx the parse tree
     */
    @Override
    public Object visitConjunctionElim(ProofGrammarParser.ConjunctionElimContext ctx) {

        Integer reference = (Integer) visit(ctx.singleReference());

        if(!manager.isValidSingleReference(reference)) {
            manager.setCurrentEvaluationWrong("Invalid reference.");
            return null;
        }

        if(!manager.isCorrectBinaryExpression(reference, "&&")) {
            manager.setCurrentEvaluationWrong("Referred line is not a conjunction.");
            return null;
        }

        if(!manager.isCurrentPartOfBinaryExpression(reference)) {
            manager.setCurrentEvaluationWrong("Not part of a binary expression.");
            return null;
        }
        return null;
    }

    /**
     * A disjunction elimination looks at the referred line and checks if the sentence is equal to any element of the
     * inferred sentence.
     * @param ctx the parse tree
     */
    public Object visitDisjunctionIntro(ProofGrammarParser.DisjunctionIntroContext ctx) {

        Integer reference = (Integer) visit(ctx.singleReference());

        if(!manager.isValidSingleReference(reference)) {
            manager.setCurrentEvaluationWrong("Invalid reference.");
            return null;
        }

        if(!manager.isCurrentCorrectBinaryExpression("||")) {
            manager.setCurrentEvaluationWrong("Inferred sentence is not a disjunction.");
            return null;
        }

        if(!manager.isPartOfCurrentBinaryExpression(reference)) {
            manager.setCurrentEvaluationWrong("Is not part of a binary expression.");
            return null;
        }
        return null;
    }

    /**
     * In the Disjunction Elimination we need: 2 subrpoofs and a 1 initial disjunction.
     * We are checking if the premises of the subproofs are elements of the disjunction and if the conclusions of the
     * subproofs correspond with the inferred sentence.
     * @param ctx the parse tree
     */
    @Override
    public Object visitDisjunctionElim(ProofGrammarParser.DisjunctionElimContext ctx) {

        Integer reference = (Integer) visit(ctx.singleReference());
        String range1 = (String) visit(ctx.rangeReference(0));
        String range2 = (String) visit(ctx.rangeReference(1));

        Integer range1Start = Integer.parseInt(range1.split("-")[0]);
        Integer range1End = Integer.parseInt(range1.split("-")[1]);
        Integer range2Start = Integer.parseInt(range2.split("-")[0]);
        Integer range2End = Integer.parseInt(range2.split("-")[1]);

            // Check references
        if(!manager.isValidSingleReference(reference) || !manager.isValidRangeReference(range1Start, range1End)
                || !manager.isValidRangeReference(range2Start, range2End)) {
            manager.setCurrentEvaluationWrong("Invalid reference.");
            return null;
        }

            // Check if the referred line is a disjunction
        if(!manager.isCorrectBinaryExpression(reference, "||")) {
            manager.setCurrentEvaluationWrong("Referred line: " + reference + " is not a disjunction.");
            return null;
        }

            // Check premises of the 2 subproofs
        if(!manager.isPartOfBinaryExpression(range1Start, reference)
                || !manager.isPartOfBinaryExpression(range2Start, reference)) {
            manager.setCurrentEvaluationWrong("Wrong premises for disjunction elimination");
            return null;
        }

            // Check conclusions of the 2 subproofs
        if(!manager.getCurrentSentence().getText().equals(manager.getSentence(range1End).getText())
                || !manager.getCurrentSentence().getText().equals(manager.getSentence(range2End).getText()) ) {
            manager.setCurrentEvaluationWrong("The conclusions of the subproofs do not match with the inferred line.");
        }
        return null;
    }

    /**
     * Returns the reference to a sentence that the current line is based on.
     * @param ctx the parse tree
     * @return the reference to the sentence as Integer.
     */
    @Override
    public Integer visitSingleReference(ProofGrammarParser.SingleReferenceContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    /**
     * The reference range represents the first and last line of a subproof.
     * To use a subproof we only need to be looking at those lines since the rest of the subproof is evaluated
     * to be valid on its own.
     * @param ctx the parse tree
     * @return the range as a map as a String which contains the interval, because no tuples.
     */
    @Override
    public String visitRangeReference(ProofGrammarParser.RangeReferenceContext ctx) {return ctx.getText();
    }
}
