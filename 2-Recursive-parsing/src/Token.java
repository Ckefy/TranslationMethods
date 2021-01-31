public enum Token {
    VAR("'var'"),
    VARNAME("'varname'"),
    COLON("':'"),
    ARRAY("'Array'"),
    LEFT("'<'"),
    RIGHT("'>'"),
    SEMICOLON("';'"),
    COMA("','"),
    END("'$'"),
    ERROR("'error'");

    private final String str;

    Token(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}

//var x: Array<Int>;
