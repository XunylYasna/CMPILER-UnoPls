package analyzer;

import Managers.execution.ExecutionManager;
import Managers.symbols.Scope;
import Managers.symbols.SymbolTableManager;
import antlr.UnoPlsParser;
import commands.simple.PrintCommand;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

//(method body context) - Handles initalizing the local scope for code blocks (inside classes, inside functions, inside loops)
public class BlockAnalyzer implements ParseTreeListener {

    private boolean main = false;

    public BlockAnalyzer(){

    }

    public void analyze(UnoPlsParser.BlockContext ctx) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, ctx);
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        if(parserRuleContext instanceof UnoPlsParser.LocalVariableDeclarationStatementContext) {
            System.out.println("Variable Declaration");
            UnoPlsParser.LocalVariableDeclarationContext variableContext = ((UnoPlsParser.LocalVariableDeclarationStatementContext)parserRuleContext).localVariableDeclaration();
            VariableAnalyzer variableAnalyzer = new VariableAnalyzer();
            variableAnalyzer.analyze(variableContext);
        }
        else if(parserRuleContext instanceof UnoPlsParser.StatementContext){
            System.out.println("Statement Analyzer");
            UnoPlsParser.StatementContext statementContext = ((UnoPlsParser.StatementContext)parserRuleContext);
            StatementAnalyzer statementAnalyzer = new StatementAnalyzer();
            statementAnalyzer.analyze(statementContext);
        }
        else if(parserRuleContext instanceof UnoPlsParser.FunctionCallerContext){
            System.out.println("Function Caller - ");
            System.out.println(parserRuleContext.getText());

//            ((UnoPlsParser.FunctionCallerContext) parserRuleContext).identifier();
            if(parserRuleContext.getText().substring(0,6).equals("print(")){
                SymbolTableManager.getInstance().getCurrentFunction().addCommand(new PrintCommand((UnoPlsParser.FunctionCallerContext) parserRuleContext));
            }
            else if (parserRuleContext.getText().substring(0,5).equals("scan(")){

            }
            else{

            }
        }

        else{

        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
