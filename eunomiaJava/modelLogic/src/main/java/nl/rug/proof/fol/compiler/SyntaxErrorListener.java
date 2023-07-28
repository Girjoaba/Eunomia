package nl.rug.proof.fol.compiler;

import nl.rug.proof.fol.compiler.manager.ProofManager;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.Collections;
import java.util.List;

/**
 * Custom Syntax error listener made for the ANTLR technology.
 * The main function of this class is to store the syntax errors in the ProofManager.
 */
public class SyntaxErrorListener extends BaseErrorListener {

    private ProofManager manager;

    /**
     * Initializes the SyntaxErrorListener with a ProofManager.
     * @param manager The ProofManager where all the syntax errors will be stored.
     */
    public SyntaxErrorListener(ProofManager manager) {
        this.manager = manager;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                            String msg, RecognitionException e) {

        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        manager.getSyntaxErorrs().addError(line, msg);
    }
}
