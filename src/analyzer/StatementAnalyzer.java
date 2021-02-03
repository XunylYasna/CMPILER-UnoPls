package analyzer;

import Managers.commandControl.CommandControlManager;
import antlr.UnoPlsParser;
import commands.controlled.IControlledCommand;
import commands.controlled.IfCommand;
import commands.evaluation.AssignmentCommand;


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
            CommandControlManager.getInstance().initializeCommand((IControlledCommand) ifCommand, ifCommand.getControlType());
            BlockAnalyzer.addCommand(ifCommand, "If command in ", true);

//            CommandControlManager.getInstance().initializeCommand(ifCommand, ifCommand.getControlType());
        }
        // if else  statement
        else if(statementCtx.ifThenElseStatement() != null){
            UnoPlsParser.IfThenElseStatementContext ifThenElseStatementContext = statementCtx.ifThenElseStatement();
            IfCommand ifCommand = new IfCommand(ifThenElseStatementContext.expression());

            //Call command control manager to instantiate the if command
            CommandControlManager.getInstance().initializeCommand((IControlledCommand) ifCommand, ifCommand.getControlType());
            BlockAnalyzer.addCommand(ifCommand, "If Else command in ", true);
//            CommandControlManager.getInstance().initializeCommand(ifCommand, ifCommand.getControlType());
        }
        //empty statement
        else if(statementCtx.statementWithoutTrailingSubstatement().emptyStatement() != null){
            // do nothing
        }
//        else if(statementCtx.statementWithoutTrailingSubstatement().block() != null){
//            UnoPlsParser.BlockContext blockCtx = statementCtx.statementWithoutTrailingSubstatement().block();
//            BlockAnalyzer blockAnalyzer = new BlockAnalyzer();
//            blockAnalyzer.analyze(blockCtx);
//        }

        //TODO AYUSIN MO TO HAYUP, magulo pero pwede na siguro
        else if(statementCtx.statementWithoutTrailingSubstatement() != null){
            if(statementCtx.statementWithoutTrailingSubstatement().expressionStatement() != null){
                if (statementCtx.statementWithoutTrailingSubstatement().expressionStatement().statementExpression().assignment() != null) {

                    UnoPlsParser.AssignmentContext assignmentContext = statementCtx.statementWithoutTrailingSubstatement().expressionStatement().statementExpression().assignment();
                    AssignmentCommand assignmentCommand = new AssignmentCommand(assignmentContext.leftHandSide(), assignmentContext.expression());

                    //If currently in control command, add command to the control
                    BlockAnalyzer.addCommand(assignmentCommand, "Variable assignment in ", false);
                }
            }
        }

    }
}
