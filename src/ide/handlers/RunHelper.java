package ide.handlers;

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
import org.antlr.v4.runtime.tree.ParseTree;
import org.fxmisc.richtext.CodeArea;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class RunHelper {
    ArrayList<String> syntaxErrors;
    CodeArea codeArea;
    TextFlow console;

    public RunHelper(CodeArea codeArea, TextFlow console){
        this.codeArea = codeArea;
        this.console = console;
        this.syntaxErrors = new ArrayList<>();
    }


    public void run(){
        //Delete previous logs
        console.getChildren().clear();
        String input = codeArea.getText();

        System.out.println("Running Program with the following input: ");
        System.out.println(input);
        System.out.println("=====================End of input=====================");


        // Get generated parse tree
        UnoPlsParser parser = getParser(input);
        ParseTree antlrAST = parser.compilationUnit();

        if(SyntaxErrorListener.syntaxErrFlag) {
            //If there are syntax errors, add errors to the log
            for(int i = 0; i < syntaxErrors.size(); i++){
                Text error = new Text(syntaxErrors.get(i).replaceAll("_LINEBREAK_", "\n"));
                error.setFill(Color.RED);
                console.getChildren().add(error);
            }
        }
        else{
            //Check for semantic errors and fill up SymbolTable, CommandTable

            //If semantic errors exist add errors to logs

            //Else execute
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

//        lexer.removeErrorListeners();
//        lexer.addErrorListener(new SyntaxErrorListener(syntaxErrors));


        CommonTokenStream tokens = new CommonTokenStream(lexer);
        UnoPlsParser parser = new UnoPlsParser(tokens);
        // Syntax Error Handling
        parser.removeErrorListeners();
        SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener(this.syntaxErrors);
        parser.addErrorListener(syntaxErrorListener);


        return parser;
    }
}
