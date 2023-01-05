package nl.rug.parsers.fol;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Map;

@Slf4j
public class VisitorHelper {

    public static Boolean isValidSingleReference(Integer currentLine, Integer referredLine) {
        if(referredLine >= currentLine) {
            return false;
        }
        return true;
    }

    public static Boolean isValidRangeReference(Integer currentLine, Integer rangeStart, Integer rangeEnd) {
        if(rangeStart >= currentLine) {
            return false;
        }
        if(rangeEnd >= currentLine) {
            return false;
        }
        return true;
    }

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
