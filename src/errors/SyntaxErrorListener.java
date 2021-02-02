package errors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class SyntaxErrorListener extends BaseErrorListener{

    public boolean syntaxErrFlag = false;
    private ArrayList<String> syntaxErrors;
    private int syntaxErrLine = -69;


    public SyntaxErrorListener() {
        this.syntaxErrors = new ArrayList<>();
    }

    @Override
    public void syntaxError(
            Recognizer<?, ?> recognizer,
            Object offendingSymbol,
            int line,
            int charPositionInLine,
            String msg, RecognitionException e) {

        syntaxErrFlag = true;


        List<String> errorList = ((Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(errorList);

        //Cleaning up error messages
        // Checks different instances of Recognition Exceptions
        if(e instanceof InputMismatchException) {
            msg = "<--- check mo to sir may nakalimutan atang ka partner - InputMismatchException";
        }
        if(e instanceof NoViableAltException) {
            msg = "<--- pre parang di pa ata to tapos - NoViableAltException";
        }
        if(e instanceof LexerNoViableAltException) {
            msg = "<--- alam mo yung stackoverflow pre? dun ka muna - LexerNoViableAltException";
        }
        if(e instanceof FailedPredicateException) {
            msg = "ano ba sinusubukan mo sabihin awit check documentation - FailedPredicateException";
        }

        //Special cases
        if(msg.contains("extraneous input")) {
            msg = "<--- feeling ko sumobra ka dito pre - Extraneous input";
        }
        else if(msg.contains("missing 'up to'")) {
            msg = "<--- my dude 'up to' ata ibig mong sabihin";
        }
        else if(msg.contains("missing '}'")) {
            msg = "missing yung bracket sana all miss";
        }
        if(syntaxErrLine != line) {
            System.err.println("Syntax Error(" + line + "," + charPositionInLine + ") : Token '" + ((Token) offendingSymbol).getText() + "' " + msg);
            this.syntaxErrors.add("Syntax Error(" + line + "," + charPositionInLine + ") : Token '" + ((Token) offendingSymbol).getText() + "' " + msg);
            syntaxErrLine = line;
        }
    }

    public ArrayList<String> getSyntaxErrors() {
        return this.syntaxErrors;
    }

    public boolean isSyntaxErrFlag(){
        return this.syntaxErrFlag;
    }
}
