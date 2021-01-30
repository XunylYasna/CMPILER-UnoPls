package antlrHelper;

import antlr.UnoPlsBaseVisitor;
import antlr.UnoPlsParser;
import antlr.UnoPlsVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class UnoVisitor extends UnoPlsBaseVisitor<Void> {

    public UnoVisitor(){

    }

    public void enterVariableDeclaratorList(UnoPlsParser.VariableDeclaratorListContext ctx) {
        System.out.println("Enter Variable Declarator: " + ctx.toString());
    }

    public void exitVariableDeclaratorList(UnoPlsParser.VariableDeclaratorListContext ctx) {

    }
}
