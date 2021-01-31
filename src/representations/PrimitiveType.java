package representations;


public enum PrimitiveType {
    EWAN("ewan"),
    ARRAY("array"),
    BOOL("boolean"),
    CHAR("char"),
    INT("int"),
    FLOAT("float"),
    STRING("string"),
    VOID("void");

    private String token;

    PrimitiveType(String token){
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public static PrimitiveType fromString(String text) {
        for (PrimitiveType t : PrimitiveType.values()) {
            if (t.token.equalsIgnoreCase(text)) {
                return t;
            }
        }
        return PrimitiveType.EWAN;
    }
}
