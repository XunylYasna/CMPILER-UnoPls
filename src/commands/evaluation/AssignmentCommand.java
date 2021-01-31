package commands.evaluation;

import Managers.symbols.Scope;
import Managers.symbols.SymbolTableManager;
import antlr.UnoPlsParser;
import commands.EvaluateCommand;
import commands.ICommand;
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
        EvaluateCommand evaluateCommand = new EvaluateCommand(this.rightHand);
        evaluateCommand.execute();
        Object result = evaluateCommand.evaluateExpression();
        value = new Value(result, assignmentScope.findVariableValueAllScopes(leftHand.getText()).getPrimitiveType());

    }

    @Override
    public void execute() {
        assignmentScope.reAssignVariable(leftHand.getText(), this.value);
    }
}
