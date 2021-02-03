package analyzer;

import Managers.execution.ExecutionManager;
import Managers.symbols.Scope;
import Managers.symbols.SymbolTableManager;
import antlr.UnoPlsParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import representations.PrimitiveType;
import representations.UnoFunction;


// (mainDeclaration) - Handles finding the main class, checking for duplicate main classes
public class MainAnalyzer implements ParseTreeListener {

    private UnoFunction function;

    public MainAnalyzer() {

    }

    public void analyze(UnoPlsParser.MainDeclarationContext ctx) {
        if(!ExecutionManager.getInstance().hasFoundEntryPoint()) {
            ExecutionManager.getInstance().reportEntryPoint();

            //Create a main function
            function = new UnoFunction("main", null, PrimitiveType.VOID);
            SymbolTableManager.getInstance().addFunction("main", function);
            SymbolTableManager.getInstance().setCurrentFunction(function);
            SymbolTableManager.getInstance().setCurrentScope(function.getFunctionScope());

            ParseTreeWalker treeWalker = new ParseTreeWalker();
            treeWalker.walk(this, ctx);
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
            BlockAnalyzer blockAnalyzer = new BlockAnalyzer(this.function.getFunctionScope());
            blockAnalyzer.analyze(blockCtx);
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
