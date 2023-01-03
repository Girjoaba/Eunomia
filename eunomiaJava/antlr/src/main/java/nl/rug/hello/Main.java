package nl.rug.hello;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

@Slf4j
public class Main {
    public static void main(String[] args) throws IOException {


        InputStream is = Main.class.getClassLoader().getResourceAsStream("text.in");
        InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(isr);

        for (String line; (line = reader.readLine()) != null;) {
            HelloLexer helloLexer = new HelloLexer(new ANTLRInputStream(line));
            CommonTokenStream tokens = new CommonTokenStream(helloLexer);
            HelloParser helloParser = new HelloParser(tokens);

            ParseTree parseTree = helloParser.r();

            for(Token token : tokens.getTokens()) {
                log.info(token.toString());
            }
        }
    }
}