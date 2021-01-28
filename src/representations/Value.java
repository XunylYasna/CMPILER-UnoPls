package representations;

import java.util.Stack;


public class Value {

    private Stack<Object> defaultValue; //this value will no longer change.
    private Stack<Object> value;
    private PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;
    private boolean finalFlag = false;


    public Value(Object value, PrimitiveType primitiveType) {
        if(value == null || checkValueType(value, primitiveType)) {
            this.value = new Stack<Object>();

            this.value.push(value);
            this.primitiveType = primitiveType;
        }
        else {
            System.out.println("Value is not appropriate for  " +primitiveType+ "!");
        }
    }

    public void setPrimitiveType(PrimitiveType primitiveType) {
        this.primitiveType = primitiveType;
    }

    public void reset() {
        this.value = this.defaultValue;
    }

    public Object popBack() {
        if (this.value.size() > 2)
            return this.value.pop();

        return null;
    }

    public int stackSize() {
        return value.size();
    }

    /*
     * Marks this value as final if there is a final keyword
     */
    public void markFinal() {
        this.finalFlag = true;
    }

    public boolean isFinal() {
        return this.finalFlag;
    }

    public void setValue(String value) {

        if(this.primitiveType == PrimitiveType.NOT_YET_IDENTIFIED) {
            System.out.println("Primitive type not yet identified!");
        }
        else if(this.primitiveType == PrimitiveType.STRING) {
            value.replace("\"", "");

            this.value.push(value.replace("\"", ""));
        }
        else if(this.primitiveType == PrimitiveType.ARRAY) {
            System.out.println(this.primitiveType + " is an array. Cannot directly change value.");
        }
        else {
            //attempts to type cast the value
            this.value.push(this.attemptTypeCast(value));
        }
    }


    private Object attemptTypeCast(String value) {
        switch(this.primitiveType) {
            case CHAR: return Character.valueOf(value.charAt(0));
            case BOOL: return Boolean.valueOf(value);
            case INT:
                String s = value;

                if(s.contains(".")) {
                    String[] split = s.split("[.]");
                    return Integer.valueOf(split[0]);
                } else {
                    return Integer.valueOf(value);
                }
            case FLOAT: return Double.valueOf(value);
            case STRING: return value;
            default: return null;
        }
    }

    public Object getValue() {
        return this.value.peek();
    }

    public PrimitiveType getPrimitiveType() {
        return this.primitiveType;
    }

    public static boolean checkValueType(Object value, PrimitiveType primitiveType) {
        switch(primitiveType) {
            case CHAR:
                return value instanceof Character;
            case BOOL:
                return value instanceof Boolean;
            case INT:
                return value instanceof Integer;
            case FLOAT:
                return value instanceof Double;
            case STRING:
                return value instanceof String;
            case ARRAY:
                return value instanceof Object;
            default:
                return false;
        }
    }

    /*
     * Utility function.
     * Attempts to add an empty variable based from keywords
     */
    public static Value createEmptyVariableFromKeywords(String primitiveTypeString) {

        //identify primitive type
        PrimitiveType primitiveType = PrimitiveType.NOT_YET_IDENTIFIED;

        if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_BOOLEAN, primitiveTypeString)) {
            primitiveType = PrimitiveType.BOOL;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_CHAR, primitiveTypeString)) {
            primitiveType = PrimitiveType.CHAR;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_DECIMAL, primitiveTypeString)) {
            primitiveType = PrimitiveType.FLOAT;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_INT, primitiveTypeString)) {
            primitiveType = PrimitiveType.INT;
        }
        else if(RecognizedKeywords.matchesKeyword(RecognizedKeywords.PRIMITIVE_TYPE_STRING, primitiveTypeString)) {
            primitiveType = PrimitiveType.STRING;
        }

        Value value = new Value(null, primitiveType);

        return value;
    }
}
