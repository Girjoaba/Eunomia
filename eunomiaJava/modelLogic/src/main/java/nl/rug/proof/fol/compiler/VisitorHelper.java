package nl.rug.proof.fol.compiler;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;

@Slf4j
public class VisitorHelper {
    public static Boolean isPartOfBinaryExpression(ParseTree ctx, ParseTree binaryExpression) {

        if(binaryExpression.getChildCount() != 3) {
            return false;
        }

        if(!ctx.getText().equals(binaryExpression.getChild(0).getText()) &&
                !ctx.getText().equals(binaryExpression.getChild(2).getText())) {
            return false;
        }

        return true;
    }
}
