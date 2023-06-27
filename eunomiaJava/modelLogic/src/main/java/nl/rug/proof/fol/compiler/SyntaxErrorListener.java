package nl.rug.proof.fol.compiler;

import nl.rug.proof.fol.compiler.manager.ProofManager;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.Collections;
import java.util.List;

public class SyntaxErrorListener extends BaseErrorListener {

    private ProofManager manager;

    public SyntaxErrorListener(ProofManager manager) {
        this.manager = manager;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                            String msg, RecognitionException e) {

        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        System.err.println("rule stack: "+stack);
        System.err.println("line "+line+":"+charPositionInLine+" at "+
                offendingSymbol+": "+msg);
        manager.getSyntaxErorrs().addError(line, "Syntax Error");
    }
}
