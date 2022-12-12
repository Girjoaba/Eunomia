package nl.rug.parsers.fol;

import lombok.extern.slf4j.Slf4j;
import nl.rug.parsers.FitchGrammarLexer;
import nl.rug.parsers.FitchGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

@Slf4j
public class FOLAntlrParser {
    public static void main(String[] args) throws IOException {


        InputStream is = FOLAntlrParser.class.getClassLoader().getResourceAsStream("test.txt");
        InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(isr);
        for (String line; (line = reader.readLine()) != null;) {
            log.info(line);
            CharStream charStream = CharStreams.fromString(line);
            FitchGrammarLexer fitchGrammarLexer = new FitchGrammarLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(fitchGrammarLexer);
            FitchGrammarParser fitchGrammarParser = new FitchGrammarParser(commonTokenStream);

            ParseTree parseTree = fitchGrammarParser.justification();
            log.info("done");
        }
    }
}
