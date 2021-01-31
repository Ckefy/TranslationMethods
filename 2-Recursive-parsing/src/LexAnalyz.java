import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Map;

public class LexAnalyz {
    private InputStream is;
    private int curChar;
    private int curPos;
    private Token curToken;

    LexAnalyz(InputStream is) throws ParseException {
        this.is = is;
        this.curPos = -1; //where we have curChar
        nextChar();
        nextToken();
    }

    private boolean isBlank(int c) {
        return c == ' ' ||
                c == '\n' ||
                c == '\r' ||
                c == '\t';
    }

    private void nextChar() throws ParseException {
        curPos++;
        try {
            curChar = is.read();
        } catch (IOException e) {
            throw new ParseException(e.getMessage(), curPos);
        }
    }

    private static final Map<String, Token> tokenMap = Map.ofEntries(
            Map.entry("var", Token.VAR),
            Map.entry(":", Token.COLON),
            Map.entry("Array", Token.ARRAY),
            Map.entry("$", Token.END),
            Map.entry("<", Token.LEFT),
            Map.entry(">", Token.RIGHT),
            Map.entry(";", Token.SEMICOLON),
            Map.entry(",", Token.COMA)
    );

    public void nextToken() throws ParseException {
        while (isBlank(curChar)) {
            nextChar();
        }
        if (Character.isAlphabetic(curChar) || curChar == '_') {
            StringBuilder str = new StringBuilder();
            while (Character.isAlphabetic(curChar) || curChar == '_' || Character.isDigit(curChar)) {
                str.append((char) curChar);
                nextChar();
            }
            curToken = tokenMap.getOrDefault(new String(str), Token.VARNAME);
        } else {
            if (curChar == (-1)) {
                curToken = Token.END;
                return;
            }
            StringBuilder str = new StringBuilder();
            str.append((char) curChar);
            curToken = tokenMap.getOrDefault(new String(str), Token.ERROR);
            if (curToken == Token.ERROR){
                throw new ParseException("Illegal character " + (char) curChar + " at index " + curPos, curPos);
            }
            nextChar();
        }
    }

    public Token getCurToken() {
        return curToken;
    }

    public int getCurPos() {
        return curPos;
    }
}
