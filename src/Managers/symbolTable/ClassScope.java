package Managers.symbolTable;

import representations.Functions;
import representations.Value;

import java.util.HashMap;

public class ClassScope implements IScope{
    //holds public and private variables as separate lists
    //holds public and private functions as separate lists
    //holds the parent scope, an instance of local scope, the parent scope pertains to the scope of main
    // only 1 class can have the main function. Therefore, other classes have the parent scope set to null

    private String className;
    private HashMap<String, Value> publicVariables;
    private HashMap<String, Value> privateVariables;

    private HashMap<String, Functions> publicFuntions;
    private HashMap<String, Functions> privateFuntions;
}
