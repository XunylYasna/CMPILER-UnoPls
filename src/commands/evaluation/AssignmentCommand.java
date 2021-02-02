package commands.evaluation;

import Managers.symbols.Scope;
import Managers.symbols.SymbolTableManager;
import antlr.UnoPlsParser;
import commands.EvaluateCommand;
import commands.ICommand;
import representations.UnoFunction;
import representations.Value;

public class AssignmentCommand implements ICommand {

    private UnoPlsParser.LeftHandSideContext leftHand;
    private UnoPlsParser.ExpressionContext rightHand;
    private Value value;
    private Scope assignmentScope;

    public AssignmentCommand(UnoPlsParser.LeftHandSideContext leftHand, UnoPlsParser.ExpressionContext rightHand) {
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        assignmentScope = SymbolTableManager.getInstance().getCurrentScope();
    }

    @Override
    public void execute() {
        System.out.println("Reassigning variable " + leftHand.getText() + " in " + SymbolTableManager.getInstance().getCurrentFunction().getFunctionName());
        EvaluateCommand evaluateCommand = new EvaluateCommand(this.rightHand);
        evaluateCommand.execute();
        Object result = evaluateCommand.evaluateExpression();
        // Feeling ko may chance na madapa to dahil gumagawa ka ng bagong variable not technically reassigning pre dun sa type shit
        this.value = new Value(result, assignmentScope.findVariableValueAllScopes(leftHand.getText()).getPrimitiveType());
        assignmentScope.reAssignVariable(leftHand.getText(), this.value);
    }
}
