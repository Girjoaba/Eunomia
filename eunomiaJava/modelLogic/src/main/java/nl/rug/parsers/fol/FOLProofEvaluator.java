package nl.rug.parsers.fol;

import lombok.extern.slf4j.Slf4j;
import nl.rug.parsers.antlrAPI.ProofGrammarLexer;
import nl.rug.parsers.antlrAPI.ProofGrammarParser;
import nl.rug.utility.StringConverter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

@Slf4j
public class FOLProofEvaluator {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(StringConverter.getStringFromTXT("input.txt"));

        ProofGrammarLexer lexer = new ProofGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProofGrammarParser parser = new ProofGrammarParser(tokens);
        ParseTree tree = parser.proof();
        System.out.println(tree.toStringTree(parser));

    }
}
