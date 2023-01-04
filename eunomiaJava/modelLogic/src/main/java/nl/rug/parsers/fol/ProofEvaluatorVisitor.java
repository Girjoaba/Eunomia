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
     * A map acting as memory to remember which was the main connective of each line.
     */
    private final Map<Integer, String> mainConnectiveMap = new HashMap<Integer, String>();
    private final Map<Integer, ParseTree> sentenceMap = new HashMap<Integer, ParseTree>();
    private Integer currentLine = 0;

    @Override
    public Object visitProofLine(ProofGrammarParser.ProofLineContext ctx) {
        currentLine = (Integer) visit(ctx.proofLineNum());
        visit(ctx.inference());
        return null;
    }

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

    @Override
    public Object visitSentenceInfer(ProofGrammarParser.SentenceInferContext ctx) {
        visit(ctx.sentence(0));
        visit(ctx.justification());
        return null;
    }

    @Override
    public Object visitConjunction(ProofGrammarParser.ConjunctionContext ctx) {
        String conjunction = "&&";
        mainConnectiveMap.put(currentLine, conjunction);
        sentenceMap.put(currentLine, ctx);
        return null;
    }

    @Override
    public Object visitDisjunction(ProofGrammarParser.DisjunctionContext ctx) {
        String disjunction = "||";
        mainConnectiveMap.put(currentLine, disjunction);
        sentenceMap.put(currentLine, ctx);
        return null;
    }

    @Override
    public Object visitAtomic(ProofGrammarParser.AtomicContext ctx) {
        sentenceMap.put(currentLine, ctx);
        return null;
    }


    /*
     * -------------------------------------- JUSTIFICATION STUFF -------------------------------
     */

    @Override
    public Object visitPremise(ProofGrammarParser.PremiseContext ctx) {
        log.info("Line " + currentLine + " is applied correctly.");
        return null;
    }

    @Override
    public Object visitReiteration(ProofGrammarParser.ReiterationContext ctx) {
        Integer reference = (Integer) visit(ctx.singleReference());
        if(!sentenceMap.get(reference).getText().equals(sentenceMap.get(currentLine).getText())) {
            log.warn("Reiteration applied to different sentences.");
            return null;
        }
        log.info("Line " + currentLine + " is applied correctly.");
        return null;
    }

    @Override
    public Object visitConjunctionElim(ProofGrammarParser.ConjunctionElimContext ctx) {
        Integer reference = (Integer) visit(ctx.singleReference());
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

    @Override
    public Integer visitSingleReference(ProofGrammarParser.SingleReferenceContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    @Override
    public Map<Integer, Integer> visitRangeReference(ProofGrammarParser.RangeReferenceContext ctx) {
        Map<Integer, Integer> range = new HashMap<Integer, Integer>();
        range.put(Integer.parseInt(ctx.INT(0).getText()), Integer.parseInt(ctx.INT(1).getText()));
        return range;
    }
}
