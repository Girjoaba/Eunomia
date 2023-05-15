package nl.rug.proof.fol;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.antlrAPI.ProofGrammarLexer;
import nl.rug.proof.fol.antlrAPI.ProofGrammarParser;
import nl.rug.proof.fol.compiler.ProofEvaluatorVisitor;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import nl.rug.utility.InputPath;
import nl.rug.utility.StringConverter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileNotFoundException;

/**
 * The class which brings together the parser generated by ANTLR and the "Visitor" created for compiling the proof.
 * The compilation of the proof evaluated if the proof is correct.
 */
@Slf4j
public class EunomiaCompiler {

    private final ProofManager manager;

    /**
     * The manager acts as memory for the proof. It stores all the information related to each proof line.
     * It also includes different methods to process information.
     * @param manager the manager.
     */
    public EunomiaCompiler(ProofManager manager) {
        this.manager = manager;
    }

    /**
     * Compiles the proof.
     * First, takes the input as a string.
     * Second, the lexer creates a Parse Tree.
     * Last, the visitor evaluates the correctness of the proof by traversing the tree.
     * @param input the path where the input is stored.
     */
    public void compile(String input) {
        // Get input
        ANTLRInputStream inputANTLR = new ANTLRInputStream(input);

        // Syntax Parsing
        ProofGrammarLexer lexer = new ProofGrammarLexer(inputANTLR);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProofGrammarParser parser = new ProofGrammarParser(tokens);

        ParseTree tree = parser.proof();

        // Compilation
        ProofEvaluatorVisitor visitor = new ProofEvaluatorVisitor(manager);
        visitor.visit(tree);
    }

    /**
     * Compiles the proof from the path of a file.
     * @param path the path where the file is at.
     * @throws FileNotFoundException if the file is not found.
     */
    public void compile(InputPath path) throws FileNotFoundException {
        // Get input
        ANTLRInputStream input = new ANTLRInputStream(StringConverter.getStringFromTXT(path.getPath()));

        // Syntax Parsing
        ProofGrammarLexer lexer = new ProofGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProofGrammarParser parser = new ProofGrammarParser(tokens);

        ParseTree tree = parser.proof();

        // Compilation
        ProofEvaluatorVisitor visitor = new ProofEvaluatorVisitor(manager);
        visitor.visit(tree);
    }

    public void clear() {
        manager.clear();
    }
}
