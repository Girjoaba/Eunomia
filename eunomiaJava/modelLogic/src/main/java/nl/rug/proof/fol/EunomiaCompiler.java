package nl.rug.proof.fol;

import nl.rug.proof.fol.antlrAPI.ProofGrammarLexer;
import nl.rug.proof.fol.antlrAPI.ProofGrammarParser;
import nl.rug.proof.fol.compiler.manager.Manager;
import nl.rug.proof.fol.compiler.ProofEvaluatorVisitor;
import nl.rug.utility.StringConverter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileNotFoundException;

public class EunomiaCompiler {

    private final Manager manager;

    public EunomiaCompiler(Manager manager) {
        this.manager = manager;
    }

    public void compile(String path) throws FileNotFoundException {
            // Get input
        ANTLRInputStream input = new ANTLRInputStream(StringConverter.getStringFromTXT(path));

            // Syntax Parsing
        ProofGrammarLexer lexer = new ProofGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProofGrammarParser parser = new ProofGrammarParser(tokens);
        ParseTree tree = parser.proof();

            // Compilation
        ProofEvaluatorVisitor visitor = new ProofEvaluatorVisitor(manager);
        visitor.visit(tree);
    }
}
