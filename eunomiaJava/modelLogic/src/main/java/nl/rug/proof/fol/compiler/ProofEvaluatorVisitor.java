package nl.rug.proof.fol.compiler;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.antlrAPI.ProofGrammarBaseVisitor;
import nl.rug.proof.fol.antlrAPI.ProofGrammarParser;
import nl.rug.proof.fol.compiler.commonStrings.ErrorMessage;
import nl.rug.proof.fol.compiler.commonStrings.UsefulStrings;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

/**
 * A visitor class responsible for compiling the proof and checking the validity of each proof line.
 */
@Slf4j
public class ProofEvaluatorVisitor extends ProofGrammarBaseVisitor {

    private final ProofManager manager;

    /**
     * Initializes the visitor with a manager which acts as memory.
     * @param manager has useful methods to store, retrieve and process information about the proof.
     */
    public ProofEvaluatorVisitor(ProofManager manager) {
        this.manager = manager;
    }

    /**
     * When visiting subproofs we must visit all the elements of the subproof. Be them proof lines or other subproofs.
     * @param ctx the parse tree
     */
    @Override
    public Object visitSubproof(ProofGrammarParser.@NotNull SubproofContext ctx) {
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
    public Object visitAssume(ProofGrammarParser.@NotNull AssumeContext ctx) {
        manager.increaseLevel();
        if(ctx.premiseLine() != null) {
            visit(ctx.premiseLine());
        }

        if(ctx.constantIntroLine() != null) {
            visit(ctx.constantIntroLine());
        }

        return null;
    }

    /**
     * We visit the associated proof line but also decrease the level by 1 afterwards.
     * @param ctx the parse tree
     */
    @Override
    public Object visitQed(ProofGrammarParser.@NotNull QedContext ctx) {
        visit(ctx.conclusionLine());
        manager.decreaseLevel();
        return null;
    }

    /**
     * Visit a normal premise line of a subproof.
     * @param ctx the parse tree.
     * @return null.
     */
    @Override
    public Object visitPremiseLine(ProofGrammarParser.@NotNull PremiseLineContext ctx) {
        manager.setCurrentLine((Integer) visit(ctx.proofLineNum()));
        visit(ctx.premiseInference());
        return null;
    }

    /**
     * The proof line is the building block of the proof.
     * We extract the line number and begin visiting till we make sure the proof line is valid.
     * @param ctx the parse tree.
     */
    @Override
    public Object visitProofLine(ProofGrammarParser.@NotNull ProofLineContext ctx) {
        manager.setCurrentLine((Integer) visit(ctx.proofLineNum()));
        visit(ctx.inference());
        return null;
    }

    /**
     * Visits the last line of a subproof. It exists to guarantee that its subproof has a conclusion.
     * @param ctx the parse tree
     * @return null.
     */
    @Override
    public Object visitConclusionLine(ProofGrammarParser.@NotNull ConclusionLineContext ctx) {
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
    public Integer visitProofLineNum(ProofGrammarParser.@NotNull ProofLineNumContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    /**
     * A contradiction inference is different from a normal sentence inference because it can only contain the
     * contradiciton symbol.
     * @param ctx the parse tree.
     * @return null.
     */
    @Override
    public Object visitContradictionInfer(ProofGrammarParser.@NotNull ContradictionInferContext ctx) {
        visit(ctx.contradiction(0));
        visit(ctx.justification());
        return null;
    }

    /**
     * To make sure an inference is valid we need to check if it follows from the previous sentences. To do that we
     * use the justification to get previous sentences and check if this line is valid.
     * @param ctx the parse tree.
     */
    @Override
    public Object visitSentenceInfer(ProofGrammarParser.@NotNull SentenceInferContext ctx) {
        visit(ctx.sentence(0));
        visit(ctx.justification());
        return null;
    }

    /**
     * Visits a contradiction line from a premise.
     * This case is quite funny because it does not provide any value in an actual proof.
     * From a contradiction you can infer anything. If this is your initial premise, then everything is valid.
     * If it is the start of a subproof, then the subproof will not provide you any information.
     * Regardless, it is allowed to exist.
     * @param ctx the parse tree.
     */
    @Override
    public Object visitPremiseContradictionInfer(ProofGrammarParser.@NotNull PremiseContradictionInferContext ctx) {
        visit(ctx.contradiction(0));
        return null;
    }

    /**
     * Visits a sentence line from a premise.
     * @param ctx the parse tree
     */
    @Override
    public Object visitPremiseSentenceInfer(ProofGrammarParser.@NotNull PremiseSentenceInferContext ctx) {
        visit(ctx.sentence(0));
        return null;
    }

    /**
     * Visits a subproof premise line which introduces a constant.
     * It must add the constant to the scope while also verifying that scoping level is correct.
     * @param ctx the parse tree.
     * @return null.
     */
    @Override
    public Object visitConstantIntroLine(ProofGrammarParser.@NotNull ConstantIntroLineContext ctx) {
        manager.setCurrentLine((Integer) visit(ctx.proofLineNum()));

        String constant = ctx.getChild(1).getChild(1).getText();

        manager.addProofLine(ctx, constant);

        manager.verifyConstantIntroduction(constant, ErrorMessage.CONSTANT_ALREADY_EXISTS);
        manager.addConstantCurrentLevel(constant); // to scope

        if(ctx.sentence() != null) {
            visit(ctx.sentence());
        }

        return null;
    }

    /**
     * --------------------------------------- SPECIAL SENTENCES ---------------------------------------------
     *
     * Visits a contradiction. It is separated from the other sentences because a contradiction can only be found
     * by itself (as in just the atomic symbol).
     * @param ctx the parse tree
     */
    @Override
    public Object visitContradiction(ProofGrammarParser.ContradictionContext ctx) {
        manager.addProofLine(ctx);
        return null;
    }

    /**
     * Visits a sentence and saves it in the proof manager. It also uses the traveler to format the sentence
     * it a manageable form. In the case in which the traveler finds an error, it will set the current evaluation wrong
     * with the appropriate error message.
     * @param ctx the parse tree
     */
    @Override
    public Object visitNormalSentence(ProofGrammarParser.NormalSentenceContext ctx) {

        manager.addProofLine(ctx);

        SentenceTraveler.exploreSentence(ctx, manager);

        manager.addProofLine(ctx);

        if(!manager.isVariableBoundedTwice(manager.getCurrentLine())) {
            manager.setCurrentEvaluationWrong(ErrorMessage.VARIABLE_BOUNDED_TWICE);
        }

        return null;
    }

    /**
     * Visits a sentence in parentheses.
     * @param ctx the parse tree.
     * @return the sentence from within parentheses.
     */
    @Override
    public Object visitParenthesesSentence(ProofGrammarParser.@NotNull ParenthesesSentenceContext ctx) {
        visit(ctx.sentence());
        return ctx.sentence();
    }

    /**
     * -------------------------------------- JUSTIFICATION STUFF ---------------------------------------------.
     * @param ctx the parse tree.
     * @return null.
     */
    @Override
    public Object visitPremise(ProofGrammarParser.PremiseContext ctx) {
        return null;
    }

    /**
     * A reiteration justification, is just restating an antecedent sentence. We check if the sentences match.
     * @param ctx the parse tree
     */
    @Override
    public Object visitReiteration(ProofGrammarParser.ReiterationContext ctx) {

        Integer reference = (Integer) visit(ctx.singleReference());

        if(!manager.isValidSingleReference(reference)) {
            manager.setCurrentEvaluationWrong(ErrorMessage.INVALID_REFERENCE);
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
            manager.setCurrentEvaluationWrong(ErrorMessage.INVALID_REFERENCE);
            return null;
        }

        if(!manager.getCurrentSentence().getText().equals("\\perp")) {
            manager.setCurrentEvaluationWrong("Result not a contradiction.");
            return null;
        }

        if(!manager.getSentence(reference2).getChild(0).getText().equals("!") ||
                !manager.getSentence(reference1).getText()
                    .equals(manager.getSentence(reference2).getChild(1).getText())) {
            manager.setCurrentEvaluationWrong("Contradiction does not result from the premises." +
                " (maybe justification order is wrong ?)");
            return null;
        }
        return null;
    }

    @Override
    public Object visitContradictionElim(ProofGrammarParser.ContradictionElimContext ctx) {

        Integer reference = (Integer) visit(ctx.singleReference());
        if(!manager.isValidSingleReference(reference)) {
            manager.setCurrentEvaluationWrong(ErrorMessage.INVALID_REFERENCE);
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

        String range = (String) visit(ctx.rangeReference());

        Integer rangeStart = UsefulStrings.getRangeStart(range);
        Integer rangeEnd = UsefulStrings.getRangeEnd(range);

        if(!manager.isValidRangeReference(rangeStart, rangeEnd)) {
            manager.setCurrentEvaluationWrong("Invalid reference.");
            return null;
        }

        if(manager.getCurrentSentence().getChildCount() != 2) {
            manager.setCurrentEvaluationWrong("Inferred line is not a negation.");
            return null;
        }

        if(!manager.getSentence(rangeStart).getText().equals(manager.getCurrentSentence().getChild(1).getText())
                || !manager.getCurrentSentence().getChild(0).getText().equals("!")) {
            manager
                .setCurrentEvaluationWrong("The premise of the subproof is not negated as the result of the negation");
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

        if(manager.getSentence(reference).getChildCount() != 2
                || manager.getSentence(reference).getChild(1).getChildCount() != 2
                || !manager.getSentence(reference).getChild(0).getText().equals("!")
                || !manager.getSentence(reference).getChild(1).getChild(0).getText().equals("!")) {
            manager.setCurrentEvaluationWrong("Can only apply negation elimination to double negations.");
            return null;
        }

        if(!manager.getSentence(reference).getChild(1).getChild(1).getText()
            .equals(manager.getCurrentSentence().getText())) {
            manager.setCurrentEvaluationWrong("The inferred sentence is not the same as the double negation.");
            return null;
        }

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
            manager.setCurrentEvaluationWrong(ErrorMessage.INVALID_REFERENCE);
            return null;
        }

        if(!manager.isCurrentCorrectBinaryExpression("&&")) {
            manager.setCurrentEvaluationWrong("Inferred sentence is not a conjunction.");
            return null;
        }

        if(!manager.isPartOfCurrentBinaryExpression(reference1)
            || !manager.isPartOfCurrentBinaryExpression(reference2)) {
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
            manager.setCurrentEvaluationWrong(ErrorMessage.INVALID_REFERENCE);
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
     * @return null
     */
    public Object visitDisjunctionIntro(ProofGrammarParser.DisjunctionIntroContext ctx) {

        Integer reference = (Integer) visit(ctx.singleReference());

        if(!manager.isValidSingleReference(reference)) {
            manager.setCurrentEvaluationWrong(ErrorMessage.INVALID_REFERENCE);
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

        Integer range1Start = UsefulStrings.getRangeStart(range1);
        Integer range1End = UsefulStrings.getRangeEnd(range1);
        Integer range2Start = UsefulStrings.getRangeStart(range2);
        Integer range2End = UsefulStrings.getRangeEnd(range2);

        // Check references
        if(!manager.isValidSingleReference(reference) || !manager.isValidRangeReference(range1Start, range1End)
                || !manager.isValidRangeReference(range2Start, range2End)) {
            manager.setCurrentEvaluationWrong(ErrorMessage.INVALID_REFERENCE);
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

    @Override
    public Object visitIdentityIntro(ProofGrammarParser.IdentityIntroContext ctx) {

        if(!manager.isCurrentCorrectBinaryExpression("==")) {
            manager.setCurrentEvaluationWrong("Inferred sentence is not an identity.");
            return null;
        }

        if(!manager.getCurrentSentence().getChild(0).getText()
            .equals(manager.getCurrentSentence().getChild(2).getText())) {
            manager.setCurrentEvaluationWrong("The left and right side of the identity are not equal.");
            return null;
        }
        return null;
    }

    @Override
    public Object visitIdentityElim(ProofGrammarParser.IdentityElimContext ctx) {
        Integer reference1 = (Integer) visit(ctx.singleReference(0));
        Integer reference2 = (Integer) visit(ctx.singleReference(1));

        if(!manager.isValidSingleReference(reference1) || !manager.isValidSingleReference(reference2)) {
            manager.setCurrentEvaluationWrong(ErrorMessage.INVALID_REFERENCE);
            return null;
        }

        if(!manager.isCorrectBinaryExpression(reference2, "==")) {
            manager.setCurrentEvaluationWrong("Referred line: " + reference2 + " is not an identity.");
            return null;
        }

        ParseTree replaced = manager.getSentence(reference2).getChild(0);
        ParseTree replacer = manager.getSentence(reference2).getChild(2);

        // Check that the replaced is part of the referred line
        if(!manager.isPartOfBinaryExpression(replaced, reference1) && !replaced.getText()
            .equals(manager.getSentence(reference1).getText())) {
            manager.setCurrentEvaluationWrong("The replaced element is not part of the referred line.");
            return null;
        }

        // Count the replacer and the replaced and calculate if the element was indeed replaced
        int countReplacedInitial = 0;
        for(int i = 0; i < manager.getSentence(reference1).getChildCount(); i++) {
            if(manager.getSentence(reference1).getChild(i).getText().equals(replaced.getText())) {
                countReplacedInitial++;
            }
        }

        int countReplacerInitial = 0;
        for(int i = 0; i < manager.getSentence(reference1).getChildCount(); i++) {
            if(manager.getSentence(reference1).getChild(i).getText().equals(replacer.getText())) {
                countReplacerInitial++;
            }
        }

        int countReplacedFinal = 0;
        for(int i = 0; i < manager.getCurrentSentence().getChildCount(); i++) {
            if(manager.getCurrentSentence().getChild(i).getText().equals(replaced.getText())) {
                countReplacedFinal++;
            }
        }

        int countReplacerFinal = 0;
        for(int i = 0; i < manager.getCurrentSentence().getChildCount(); i++) {
            if(manager.getCurrentSentence().getChild(i).getText().equals(replacer.getText())) {
                countReplacerFinal++;
            }
        }

        if(countReplacedInitial - countReplacedFinal != 1 || countReplacerFinal - countReplacerInitial != 1) {
            manager.setCurrentEvaluationWrong("The replaced element is not replaced by the replacer element.");
            return null;
        }

        return null;
    }

    @Override
    public Object visitImplicationIntro(ProofGrammarParser .ImplicationIntroContext ctx) {
        String range = (String) visit(ctx.rangeReference());
        Integer rangeStart = UsefulStrings.getRangeStart(range);
        Integer rangeEnd = UsefulStrings.getRangeEnd(range);

        if(!manager.isValidRangeReference(rangeStart, rangeEnd)) {
            manager.setCurrentEvaluationWrong(ErrorMessage.INVALID_REFERENCE);
            return null;
        }

        if(!manager.isCurrentCorrectBinaryExpression("->")) {
            manager.setCurrentEvaluationWrong("Inferred sentence is not an implication.");
            return null;
        }

        if(!manager.getCurrentSentence().getChild(0).getText().equals(manager.getSentence(rangeStart).getText())) {
            manager.setCurrentEvaluationWrong("The left side of the implication does not correspond " +
                "to the premise of the subproof.");
            return null;
        }

        if(!manager.getCurrentSentence().getChild(2).getText().equals(manager.getSentence(rangeEnd).getText())) {
            manager.setCurrentEvaluationWrong("The right side of the implication does not correspond " +
                "to the conclusion of the subproof.");
            return null;
        }

        return null;
    }

    @Override
    public Object visitImplicationElim(ProofGrammarParser .ImplicationElimContext ctx) {
        Integer reference1 = (Integer) visit(ctx.singleReference(0));
        Integer reference2 = (Integer) visit(ctx.singleReference(1));

        if(!manager.isValidSingleReference(reference1) || !manager.isValidSingleReference(reference2)) {
            manager.setCurrentEvaluationWrong(ErrorMessage.INVALID_REFERENCE);
            return null;
        }

        if(!manager.isCorrectBinaryExpression(reference1, "->")) {
            manager.setCurrentEvaluationWrong("Referred line: " + reference1 + " is not an implication.");
            return null;
        }

        if(!manager.getSentence(reference2).getText().equals(manager.getSentence(reference1).getChild(0).getText())) {
            manager.setCurrentEvaluationWrong("The second referred line does not correspond " +
                "to the left side of the implication.");
            return null;
        }

        if(!manager.getCurrentSentence().getText().equals(manager.getSentence(reference1).getChild(2).getText())) {
            manager.setCurrentEvaluationWrong("The inferred line does not correspond " +
                "to the right side of the implication.");
            return null;
        }

        return null;
    }

    @Override
    public Object visitBiconditionalIntro(ProofGrammarParser .BiconditionalIntroContext ctx) {
        String range1 = (String) visit(ctx.rangeReference(0));
        String range2 = (String) visit(ctx.rangeReference(1));
        Integer range1Start = UsefulStrings.getRangeStart(range1);
        Integer range1End = UsefulStrings.getRangeEnd(range1);
        Integer range2Start = UsefulStrings.getRangeStart(range2);
        Integer range2End = UsefulStrings.getRangeEnd(range2);

        if(!manager.isValidRangeReference(range1Start, range1End)
            || !manager.isValidRangeReference(range2Start, range2End)) {
            manager.setCurrentEvaluationWrong(ErrorMessage.INVALID_REFERENCE);
            return null;
        }

        if(!manager.isCurrentCorrectBinaryExpression("<->")) {
            manager.setCurrentEvaluationWrong("Inferred sentence is not a biconditional.");
            return null;
        }

        if(!manager.getSentence(range1Start).getText().equals(manager.getSentence(range2End).getText())) {
            manager.setCurrentEvaluationWrong("The premise of the first subproof must be the same " +
                "as the conclusion of the second subproof.");
            return null;
        }

        if(!manager.getSentence(range1End).getText().equals(manager.getSentence(range2Start).getText())) {
            manager.setCurrentEvaluationWrong("The conclusion of the first subproof must be the same " +
                "as the premise of the second subproof.");
            return null;
        }

        if(!manager.isPartOfCurrentBinaryExpression(range1Start)
            || !manager.isPartOfCurrentBinaryExpression(range1End)) {
            manager.setCurrentEvaluationWrong("The inferred line must be constructed from the premises " +
                "and the conclusions of the subproofs.");
            return null;
        }

        return null;
    }

    @Override
    public Object visitBiconditionalElim(ProofGrammarParser .BiconditionalElimContext ctx) {
        Integer reference1 = (Integer) visit(ctx.singleReference(0));
        Integer reference2 = (Integer) visit(ctx.singleReference(1));

        if(!manager.isValidSingleReference(reference1) || !manager.isValidSingleReference(reference2)) {
            manager.setCurrentEvaluationWrong(ErrorMessage.INVALID_REFERENCE);
            return null;
        }

        if(!manager.isCorrectBinaryExpression(reference1, "<->")) {
            manager.setCurrentEvaluationWrong("Referred line: " + reference1 + " is not a biconditional.");
            return null;
        }

        if(!manager.isPartOfBinaryExpression(reference2, reference1)) {
            manager.setCurrentEvaluationWrong("The second referred line must be part of the biconditional.");
            return null;
        }

        // Get the implied sentence depending on the referred line.
        String impliedSentence;
        if(manager.getSentence(reference2).getText().equals(manager.getSentence(reference1).getChild(0).getText())) {
            impliedSentence = manager.getSentence(reference1).getChild(2).getText();
        } else {
            impliedSentence = manager.getSentence(reference1).getChild(0).getText();
        }

        if(!manager.getCurrentSentence().getText().equals(impliedSentence)) {
            manager.setCurrentEvaluationWrong("The inferred line must be part of the biconditional.");
            return null;
        }

        return null;
    }

    @Override
    public Object visitForallIntro(ProofGrammarParser.ForallIntroContext ctx) {
        String range = (String) visit(ctx.rangeReference());
        Integer rangeStart = UsefulStrings.getRangeStart(range);
        Integer rangeEnd = UsefulStrings.getRangeEnd(range);

        if(!manager.isValidRangeReference(rangeStart, rangeEnd)) {
            manager.setCurrentEvaluationWrong(ErrorMessage.INVALID_REFERENCE);
            return null;
        }

        if(manager.isNotUniversalQuantifier(manager.getCurrentLine())) {
            manager.setCurrentEvaluationWrong("The inferred line must be a universal quantifier.");
            return null;
        }

        if(manager.isNotEqualNoQuantifier(manager.getCurrentLine(), rangeEnd)) {
            manager.setCurrentEvaluationWrong("The sentence after the subproof does not follow from the conclusion " +
                    "of the subproof.");
            return null;
        }

        if(!manager.isIntroducedVariableReplaced(rangeStart, rangeEnd, manager.getCurrentLine())) {
            manager.setCurrentEvaluationWrong("The introduced constant is not replaced correctly.");
            return null;
        }

        return null;
    }

    @Override
    public Object visitForallElim(ProofGrammarParser .ForallElimContext ctx) {
        Integer reference = (Integer) visit(ctx.singleReference());

        if(!manager.isValidSingleReference(reference)) {
            manager.setCurrentEvaluationWrong(ErrorMessage.INVALID_REFERENCE);
            return null;
        }

        if(manager.isNotUniversalQuantifier(reference)) {
            manager.setCurrentEvaluationWrong("The referred line must not be a universal quantifier.");
            return null;
        }

        if(manager.isNotEqualNoQuantifier(reference, manager.getCurrentLine())) {
            manager.setCurrentEvaluationWrong("The sentence with the quantifier is different from the sentence " +
                "without the quantifier.");
            return null;
        }

        if(!manager.isBoundedVariableCorrectlyReplaced(reference, manager.getCurrentLine(),
            manager.getSentence(reference).getChild(1).getText())) {
            manager.setCurrentEvaluationWrong("The bounded variable is replaced with something incorrect.");
            return null;
        }

        return null;
    }

    @Override
    public Object visitExistsIntro(ProofGrammarParser .ExistsIntroContext ctx) {

        Integer reference = (Integer) visit(ctx.singleReference());

        if(!manager.isValidSingleReference(reference)) {
            manager.setCurrentEvaluationWrong(ErrorMessage.INVALID_REFERENCE);
            return null;
        }

        if(manager.isNotExistentialQuantifier(manager.getCurrentLine())) {
            manager.setCurrentEvaluationWrong("The inferred line must be an existential quantifier.");
            return null;
        }

        if(!manager.isOnlyOneConstantReplaced(reference, manager.getCurrentLine())) {
            manager.setCurrentEvaluationWrong("More constants were replaced by existential introduction.");
            return null;
        }

        if(manager.isNotEqualNoQuantifier(manager.getCurrentLine(), reference)) {
            manager.setCurrentEvaluationWrong("The existential sentence does not follow from the reference.");
            return null;
        }

        return null;
    }

    @Override
    public Object visitExistsElim(ProofGrammarParser.ExistsElimContext ctx) {
        Integer reference = (Integer) visit(ctx.singleReference());
        String range = (String) visit(ctx.rangeReference());
        Integer rangeStart = UsefulStrings.getRangeStart(range);
        Integer rangeEnd = UsefulStrings.getRangeEnd(range);

        if(!manager.isValidSingleReference(reference) || !manager.isValidRangeReference(rangeStart, rangeEnd)) {
            manager.setCurrentEvaluationWrong(ErrorMessage.INVALID_REFERENCE);
            return null;
        }

        if(manager.isNotExistentialQuantifier(reference)) {
            manager.setCurrentEvaluationWrong("Must be an existential quantifier.");
            return null;
        }

        if(manager.isNotEqualNoQuantifier(reference, rangeStart)) {
            manager.setCurrentEvaluationWrong("The sentence after the subproof does not follow from the conclusion " +
                    "of the subproof.");
            return null;
        }

        if(!manager.getSentence(rangeEnd).getText().equals(manager.getCurrentSentence().getText())) {
            manager.setCurrentEvaluationWrong("The inferred line is not equal to the conclusion of the subproof.");
            return null;
        }

        if(!manager.removedIntroducedConstants(rangeStart, manager.getCurrentLine())) {
            manager.setCurrentEvaluationWrong("The introduced constant was not removed.");
            return null;
        }

        manager.isIntroducedConstantReplacingCorrectly(reference, rangeStart);

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
    public String visitRangeReference(ProofGrammarParser.RangeReferenceContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFunction(ProofGrammarParser.FunctionContext ctx) {
        log.info("Function: " + ctx.getText());
        return ctx.VARIABLE().getText();
    }

    @Override
    public String visitBoxedConstant(ProofGrammarParser.BoxedConstantContext ctx) {
        return ctx.CONSTANT().getText();
    }

}
