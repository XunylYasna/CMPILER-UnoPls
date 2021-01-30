package analyzer;

import Managers.symbolTable.ClassScope;
import Managers.symbolTable.IScope;
import Managers.symbolTable.LocalScope;
import Managers.symbolTable.SymbolTableManager;
import antlr.UnoPlsParser;
import javafx.scene.Parent;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

//(method body context) - Handles initalizing the local scope for code blocks (inside classes, inside functions, inside loops)
public class BlockAnalyzer implements ParseTreeListener {

    LocalScope localScope;

    public BlockAnalyzer(String parentScopeID){
        IScope parentScope = SymbolTableManager.getInstance().getClassScope(parentScopeID);
        this.localScope = new LocalScope(parentScope);

//        ((ClassScope) parentScope).addLocalScope((IScope) localScope);
        System.out.println("created block analyzer");
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
            VariableAnalyzer variableAnalyzer = new VariableAnalyzer(localScope);
            variableAnalyzer.analyze(variableContext);
        }
        else if(parserRuleContext instanceof UnoPlsParser.FunctionCallerContext){
            System.out.println("Function Caller");
        }
        else{
//            System.out.println(parserRuleContext.toString());
//            System.out.println("puta san to napunta?? - ignore? ");
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
