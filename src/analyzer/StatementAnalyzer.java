package analyzer;

import Managers.symbols.SymbolTableManager;
import antlr.UnoPlsParser;
import commands.evaluation.AssignmentCommand;

public class StatementAnalyzer {
    public StatementAnalyzer(){

    }
    public void analyze(UnoPlsParser.StatementContext statementCtx) {
        System.out.println(statementCtx.getText());

        //empty statement
        if(statementCtx.statementWithoutTrailingSubstatement().emptyStatement() != null){
            // do nothing
        }
        // Assignment statement
        else if(statementCtx.statementWithoutTrailingSubstatement().expressionStatement().statementExpression().assignment() != null){
            UnoPlsParser.AssignmentContext assignmentContext = statementCtx.statementWithoutTrailingSubstatement().expressionStatement().statementExpression().assignment();
            AssignmentCommand assignmentCommand = new AssignmentCommand(assignmentContext.leftHandSide(), assignmentContext.expression());
            SymbolTableManager.getInstance().getCurrentFunction().addCommand(assignmentCommand);
        }
    }
}
