package analyzer;

import Managers.commandControl.CommandControlManager;
import Managers.symbols.SymbolTableManager;
import antlr.UnoPlsParser;
import commands.controlled.IfCommand;
import commands.evaluation.AssignmentCommand;
import commands.simple.ReturnCommand;


public class StatementAnalyzer {
    public StatementAnalyzer(){

    }

    public void analyze(UnoPlsParser.StatementContext statementCtx) {
        System.out.println(statementCtx.getText() + "analyze statement analyzer");
        //If statement
        if (statementCtx.ifThenStatement() != null) {
            UnoPlsParser.IfThenStatementContext ifThenStatementContext = statementCtx.ifThenStatement();
            IfCommand ifCommand = new IfCommand(ifThenStatementContext.expression());

            //Call command control manager to instantiate the if command
            CommandControlManager.getInstance().initializeCommand(ifCommand, ifCommand.getControlType());

        }
        // if else  statement
        else if(statementCtx.ifThenElseStatement() != null){
            UnoPlsParser.IfThenElseStatementContext ifThenElseStatementContext = statementCtx.ifThenElseStatement();
            IfCommand ifCommand = new IfCommand(ifThenElseStatementContext.expression());

            //Call command control manager to instantiate the if command
            CommandControlManager.getInstance().initializeCommand(ifCommand, ifCommand.getControlType());
        }



        //TODO AYUSIN MO TO HAYUP, magulo pero pwede na siguro
        else if(statementCtx.statementWithoutTrailingSubstatement() != null){

            // return statement
            if(statementCtx.statementWithoutTrailingSubstatement().returnStatement() != null){
                UnoPlsParser.ExpressionContext expressionContext = statementCtx.statementWithoutTrailingSubstatement().returnStatement().expression();
                ReturnCommand returnCommand = new ReturnCommand(expressionContext, SymbolTableManager.getInstance().getCurrentFunction());
                BlockAnalyzer.addCommand(returnCommand, "Return command in ");
            }
            //empty statement
            if(statementCtx.statementWithoutTrailingSubstatement().emptyStatement() != null){
                // do nothing
            }
            else if(statementCtx.statementWithoutTrailingSubstatement().expressionStatement() != null){
                // Assignment
                if (statementCtx.statementWithoutTrailingSubstatement().expressionStatement().statementExpression().assignment() != null) {
                    UnoPlsParser.AssignmentContext assignmentContext = statementCtx.statementWithoutTrailingSubstatement().expressionStatement().statementExpression().assignment();
                    AssignmentCommand assignmentCommand = new AssignmentCommand(assignmentContext.leftHandSide(), assignmentContext.expression());

                    //If currently in control command, add command to the control
                    BlockAnalyzer.addCommand(assignmentCommand, "Variable assignment in ");
                }
            }
        }

    }
}
