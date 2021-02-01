package analyzer;

import antlr.UnoPlsParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import representations.PrimitiveType;

public class FunctionDeclarationAnalyzer implements ParseTreeListener {

    public FunctionDeclarationAnalyzer(){

    }

    public void analyze(UnoPlsParser.FunctionDeclarationContext functionDeclarationContext){
        System.out.println(functionDeclarationContext.getText());

        //Create function object

        PrimitiveType resultType = PrimitiveType.fromString(functionDeclarationContext.methodHeader().result().getText()); // gets result type
        String functionName = functionDeclarationContext.methodHeader().methodDeclarator().identifier().getText(); // get function name
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
