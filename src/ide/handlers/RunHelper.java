package ide.handlers;

import Managers.errors.SemanticErrorManager;
import Managers.execution.ExecutionManager;
import Managers.io.OutputManager;
import Managers.symbols.SymbolTableManager;
import antlr.UnoPlsBaseVisitor;
import antlr.UnoPlsLexer;
import antlr.UnoPlsParser;
import errors.SyntaxErrorListener;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.fxmisc.richtext.CodeArea;
import representations.UnoFunction;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class RunHelper {
    ArrayList<String> syntaxErrors;
    CodeArea codeArea;
    TextFlow console;

    ExecutionManager executionManager;
    SymbolTableManager symbolTableManager;
    SemanticErrorManager semanticErrorManager;
    OutputManager outputManager;

    SyntaxErrorListener syntaxErrorListener;

    public RunHelper(CodeArea codeArea, TextFlow console){
        this.codeArea = codeArea;
        this.console = console;
        this.syntaxErrors = new ArrayList<>();
        executionManager = executionManager.getInstance();
        symbolTableManager = symbolTableManager.getInstance();
        semanticErrorManager = semanticErrorManager.getInstance();
        outputManager = outputManager.getInstance();
        outputManager.setConsole(this.console);
    }


    public void run(){
        //Delete previous logs
        console.getChildren().clear();
        String input = codeArea.getText();
        //Reinstantiate Execution Manager and Symbol Table Manager
        executionManager.resetExecutionManager();
        symbolTableManager.resetSymbolTableManager();
        semanticErrorManager.resetSemanticErrorManager();
        outputManager.resetOutputManager();

        symbolTableManager.getInstance();
        executionManager.getInstance();
        semanticErrorManager.getInstance();
        outputManager.getInstance();
        outputManager.setConsole(this.console);

        System.out.println("Running Program with the following input: ");
        System.out.println(input);
        System.out.println("=====================End of input=====================");


        // Get generated parse tree
        UnoPlsParser parser = getParser(input);

        ParserRuleContext parserRuleContext = parser.compilationUnit();
        System.out.println("DEBUG: " + parserRuleContext.toStringTree(parser));


        if(this.syntaxErrorListener.syntaxErrFlag) {
            //If there are syntax errors, add errors to the log
            for(int i = 0; i < syntaxErrorListener.getSyntaxErrors().size(); i++){
                Text error = new Text(syntaxErrorListener.getSyntaxErrors().get(i).replaceAll("_LINEBREAK_", "\n"));
                error.setFill(Color.RED);
                console.getChildren().add(error);
            }
        }
        else{
            //Check for semantic errors and fill up SymbolTable, CommandTable
            UnoPlsBaseVisitor unoVisitor = new UnoPlsBaseVisitor<Void>();
            unoVisitor.visit(parserRuleContext);

            //Add Symbol Tokens to the debugger


            //If semantic errors exist add errors to logs
            if(semanticErrorManager.isErrorFlag()){
                for(String semanticError : semanticErrorManager.getSemanticErrors()){
                    Text error = new Text(semanticError.replaceAll("_LINEBREAK_", "\n"));
                    error.setFill(Color.DARKRED);
                    console.getChildren().add(error);
                }
            }
            //Else execute all commands in the command stack
            else{
                System.out.println("===========Compiled Variables and Initialized Function Stack. Ready to execute.===========");
                UnoFunction mainFunction = SymbolTableManager.getInstance().findFunction("main");
                SymbolTableManager.getInstance().setCurrentFunction(mainFunction);
                SymbolTableManager.getInstance().setCurrentScope(mainFunction.getFunctionScope());
                // Add all commands of the main function to the execution manager
                for(int i = 0; i < mainFunction.getCommandList().size(); i++ ){
                    executionManager.addExecutionList(mainFunction.getCommandList().get(i));
                }

                executionManager.execute();

                //Fix mo pa to kasi isang bagsakan yung output mo... pano kung may scan in between
//                for(String outputLogs : outputManager.getOutputLogs()){
////                    System.out.println("output: " + outputLogs);
//                    Text log = new Text(outputLogs.replaceAll("_LINEBREAK_", "\n"));
//                    console.getChildren().add(log);
//                }

                System.out.println("===========End of Execution.===========");
            }
        }

        return;
    }

    public void parseTree(){
        // Get generated parse tree
        String input = codeArea.getText();
        UnoPlsParser parser = getParser(input);
        ParseTree antlrAST = parser.compilationUnit();

        //show AST in console
        System.out.println(antlrAST.toStringTree(parser));

        //show AST in GUI
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),antlrAST);
        viewer.setScale(1.5); // Scale a little
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    private UnoPlsParser getParser(String input){

        CharStream charStream = CharStreams.fromString(input);
        UnoPlsLexer lexer = new UnoPlsLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        UnoPlsParser parser = new UnoPlsParser(tokens);
        // Syntax Error Handling
        parser.removeErrorListeners();
        this.syntaxErrorListener = new SyntaxErrorListener();
        parser.addErrorListener(this.syntaxErrorListener);

        return parser;
    }
}
