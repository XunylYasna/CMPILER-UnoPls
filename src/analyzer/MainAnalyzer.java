package analyzer;

import Managers.ExecutionManager.ExecutionManager;
import Managers.symbolTable.ClassScope;
import Managers.symbolTable.IScope;
import Managers.symbolTable.LocalScope;
import Managers.symbolTable.SymbolTableManager;
import antlr.UnoPlsParser;
import errors.SyntaxErrorListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;


// (mainDeclaration) - Handles finding the main class, checking for duplicate main classes
public class MainAnalyzer implements ParseTreeListener {

    public MainAnalyzer() {

    }

    public void analyze(UnoPlsParser.MainDeclarationContext ctx) {
        if(!ExecutionManager.getInstance().hasFoundEntryPoint()) {
            ExecutionManager.getInstance().reportEntryPoint();

            ClassScope classScope = new ClassScope("main"); //Create a class scope for main
            SymbolTableManager.getInstance().addClassScope("main", classScope);

            ParseTreeWalker treeWalker = new ParseTreeWalker();
            treeWalker.walk(this, ctx);
//            System.out.println("main analyzer");
        }
        else {
            System.err.println("Duplicate Main ");
        }
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        if(parserRuleContext instanceof UnoPlsParser.MethodBodyContext) {
            UnoPlsParser.BlockContext blockCtx = ((UnoPlsParser.MethodBodyContext) parserRuleContext).block();
            BlockAnalyzer blockAnalyzer = new BlockAnalyzer("main");
            blockAnalyzer.analyze(blockCtx);
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
