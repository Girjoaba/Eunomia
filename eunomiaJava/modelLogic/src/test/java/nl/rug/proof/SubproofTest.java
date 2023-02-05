package nl.rug.proof;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.antlrAPI.ProofGrammarLexer;
import nl.rug.proof.fol.antlrAPI.ProofGrammarParser;
import nl.rug.proof.fol.compiler.ProofEvaluatorVisitor;
import nl.rug.utility.StringConverter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

@Slf4j
public class SubproofTest {
    @Test
    public void testSubproofBasic() {
        try {
            ANTLRInputStream input = new ANTLRInputStream(StringConverter
                    .getStringFromTXT("testProofs/subproof/subproof_basic.txt"));

            ProofGrammarLexer lexer = new ProofGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ProofGrammarParser parser = new ProofGrammarParser(tokens);
            ParseTree tree = parser.proof();
            System.out.println(tree.toStringTree(parser));

            ProofEvaluatorVisitor visitor = new ProofEvaluatorVisitor();
            visitor.visit(tree);
        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testNestedSubproof() {
        try {
            ANTLRInputStream input = new ANTLRInputStream(StringConverter
                    .getStringFromTXT("testProofs/subproof/nested_subproof.txt"));

            ProofGrammarLexer lexer = new ProofGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ProofGrammarParser parser = new ProofGrammarParser(tokens);
            ParseTree tree = parser.proof();
            System.out.println(tree.toStringTree(parser));

            ProofEvaluatorVisitor visitor = new ProofEvaluatorVisitor();
            visitor.visit(tree);
        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
