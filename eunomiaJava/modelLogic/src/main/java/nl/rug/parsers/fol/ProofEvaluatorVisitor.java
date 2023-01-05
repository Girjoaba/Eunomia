package nl.rug.parsers.fol;

import lombok.extern.slf4j.Slf4j;
import nl.rug.parsers.antlrAPI.ProofGrammarBaseVisitor;
import nl.rug.parsers.antlrAPI.ProofGrammarParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class ProofEvaluatorVisitor extends ProofGrammarBaseVisitor {
    /**
     * Maps and other variables to store different information acting as memory.
     */
    private final Map<Integer, String> mainConnectiveMap = new HashMap<Integer, String>();
    private final Map<Integer, ParseTree> sentenceMap = new HashMap<Integer, ParseTree>();
    private Integer currentLine = 0;

    /**
     * The proof line is the building block of the proof. We extract the line number and begin visiting till we make sure
     * the proof line is valid.
     * @param ctx the parse tree
     */
    @Override
    public Object visitProofLine(ProofGrammarParser.ProofLineContext ctx) {
        currentLine = (Integer) visit(ctx.proofLineNum());
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

    @Override
    public Object visitContradictionInfer(ProofGrammarParser.ContradictionInferContext ctx) {
        String contradiction = "perp";
        sentenceMap.put(currentLine, ctx);
        //visit(ctx.justification());
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

    /**
     * --------------------------------------- SPECIAL SENTENCES ---------------------------------------------
     */

    /**
     * A conjunction, we store the main connective for easier access and the sentence as a ParseTree.
     * @param ctx the parse tree
     */
    @Override
    public Object visitConjunction(ProofGrammarParser.ConjunctionContext ctx) {
        String conjunction = "&&";
        mainConnectiveMap.put(currentLine, conjunction);
        sentenceMap.put(currentLine, ctx);
        return null;
    }

    /**
     * A disjunction, we store the main connective for easier access and the sentence as a ParseTree.
     * @param ctx the parse tree
     */
    @Override
    public Object visitDisjunction(ProofGrammarParser.DisjunctionContext ctx) {
        String disjunction = "||";
        mainConnectiveMap.put(currentLine, disjunction);
        sentenceMap.put(currentLine, ctx);
        return null;
    }

    /**
     * An atomic sentence, we just store the atomic value.
     * @param ctx the parse tree
     */
    @Override
    public Object visitAtomic(ProofGrammarParser.AtomicContext ctx) {
        sentenceMap.put(currentLine, ctx);
        return null;
    }


    /*
     * -------------------------------------- JUSTIFICATION STUFF -------------------------------
     */

    /**
     * A premise is an assumption, it requires no proper justification as it is something we assume to be true.
     * @param ctx the parse tree
     * TODO: if the placement of the premise is correct, should be more at the beginning of a proof
     *            or one at the beginning of a subproof
     */
    @Override
    public Object visitPremise(ProofGrammarParser.PremiseContext ctx) {
        log.info("Line " + currentLine + " is applied correctly.");
        return null;
    }

    /**
     * A reiteration justification, is just restating an antecedent sentence. We check if the sentences match.
     * @param ctx the parse tree
     */
    @Override
    public Object visitReiteration(ProofGrammarParser.ReiterationContext ctx) {
        Integer reference = (Integer) visit(ctx.singleReference());

        if(!sentenceMap.containsKey(reference)) {
            log.warn("Referred line does not exist.");
            return null;
        }

        if(!sentenceMap.get(reference).getText().equals(sentenceMap.get(currentLine).getText())) {
            log.warn("Reiteration applied to different sentences.");
            return null;
        }

        log.info("Line " + currentLine + " is applied correctly.");
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

        if(!mainConnectiveMap.containsKey(currentLine)) {
            log.warn("Inferred sentence is not a conjunction.");
            return null;
        }

        if(!sentenceMap.containsKey(reference1) || !sentenceMap.containsKey(reference2)) {
            log.warn("Referred line does not exist.");
            return null;
        }

        if(!(mainConnectiveMap.get(currentLine).equals("&&"))) {
            log.warn("Inferred sentence is not a conjunction.");
            return null;
        }

        if(!sentenceMap.get(currentLine).getChild(0).getText().equals(sentenceMap.get(reference1).getText()) &&
                !sentenceMap.get(currentLine).getChild(0).getText().equals(sentenceMap.get(reference2).getText())) {
            log.warn("First element of inferred line is not equal to either of the referred lines.");
            return null;
        }

        if(!sentenceMap.get(currentLine).getChild(2).getText().equals(sentenceMap.get(reference1).getText()) &&
                !sentenceMap.get(currentLine).getChild(2).getText().equals(sentenceMap.get(reference2).getText())) {
            log.warn("Second element of inferred line is not equal to either of the referred lines.");
            return null;
        }

        log.info("Line " + currentLine + " is applied correctly.");
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

        if(!mainConnectiveMap.containsKey(reference)) {
            log.warn("Referred line is not a conjunction.");
            return null;
        }

        if(!mainConnectiveMap.get(reference).equals("&&")) {
            log.warn("Conjunction elimination applied to a non-conjunction.");
            return null;
        }

        if(!sentenceMap.get(reference).getChild(0).getText().equals(sentenceMap.get(currentLine).getText()) &&
                !sentenceMap.get(reference).getChild(2).getText().equals(sentenceMap.get(currentLine).getText())) {
            log.warn("The inferred sentence is not part of the conjunction.");
            return null;
        }

        log.info("Line " + currentLine + " is applied correctly.");
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
     * Reference range is used to refer to a subproof, the range referring to the lines of the subproof.
     * To use a subproof we just need to check if the base assumption and conclusion make sense. The rest of the subproof
     * is checked when we visit the subproof. For an entire proof to be valid, all the lines must be valid.
     * @param ctx the parse tree
     * @return the range as a map.
     */
    @Override
    public Map<Integer, Integer> visitRangeReference(ProofGrammarParser.RangeReferenceContext ctx) {
        Map<Integer, Integer> range = new HashMap<Integer, Integer>();
        range.put(Integer.parseInt(ctx.INT(0).getText()), Integer.parseInt(ctx.INT(1).getText()));
        return range;
    }
}
