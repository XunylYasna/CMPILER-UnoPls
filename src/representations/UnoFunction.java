package representations;

import Managers.symbols.Scope;
import Managers.symbols.SymbolTableManager;
import commands.ICommand;

import java.util.ArrayList;
import java.util.HashMap;

public class UnoFunction implements ICommand{
    private String functionName;
    private HashMap<String, Value> parameters;
    private ArrayList<ICommand> commandList;
    private Scope functionScope;
    private PrimitiveType returnType = PrimitiveType.VOID;
    private Value returnValue = null;

    public UnoFunction(String functionName, HashMap<String, Value> parameters, PrimitiveType returnType){
        this.functionName = functionName;
        this.parameters = parameters;
        this.returnType = returnType;
        this.commandList = new ArrayList<>();
        functionScope = new Scope(functionName+"-scope",null);
        SymbolTableManager.getInstance().setCurrentScope(functionScope);
    }

    @Override
    public void execute() {
        System.out.println("Executing function - " + functionName);
        for(ICommand command : commandList){
            command.execute();
        }
    }

    public Value getReturnValue(){
        return this.returnValue;
    }

    // Scope Related
    public Scope getFunctionScope(){
        return this.functionScope;
    }

    //Function Related
    public void addCommand(ICommand command){
        commandList.add(command);
    }

    public ArrayList<ICommand> getCommandList(){
        return this.commandList;
    }
}
