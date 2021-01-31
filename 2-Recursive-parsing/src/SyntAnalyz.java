import java.io.InputStream;
import java.text.ParseException;

public class SyntAnalyz {
    private LexAnalyz lex;

    Tree parse(InputStream is) throws ParseException {
        lex = new LexAnalyz(is);
        return S();
    }

    //var x: Array<Int>;

    private void check(Token need) throws ParseException {
        if (lex.getCurToken() != need) {
            throw new ParseException("Need token " + need.getStr() + " but find " + lex.getCurToken().getStr(), lex.getCurPos());
        }
    }

    private void errorAlert() throws ParseException {
        throw new ParseException(
                "Wrong token " + lex.getCurToken().getStr() + " at index " + lex.getCurPos(), lex.getCurPos());
    }

    private Tree S() throws ParseException {
        switch (lex.getCurToken()) {
            case VAR:
                lex.nextToken();
                check(Token.VARNAME);
                lex.nextToken();
                check(Token.COLON);
                lex.nextToken();
                check(Token.ARRAY);
                lex.nextToken();
                check(Token.LEFT);
                lex.nextToken();
                Tree typeName = T();
                check(Token.RIGHT);
                lex.nextToken();
                check(Token.SEMICOLON);
                lex.nextToken();
                Tree another = A();
                return new Tree("S",
                        new Tree("var"),
                        new Tree("name"),
                        new Tree(":"),
                        new Tree("Array"),
                        new Tree("<"),
                        typeName,
                        new Tree(">"),
                        new Tree(";"),
                        another);
            //case END:
              //  return new Tree("S");
            default:
                errorAlert();
                return null;
        }
    }

    private Tree A() throws ParseException {
        switch (lex.getCurToken()) {
            case VAR:
                Tree start = S();
                return new Tree("A", start);
            case END:
                return new Tree("A", new Tree("ε"));
            default:
                errorAlert();
                return null;
        }
    }

    private Tree T() throws ParseException {
        switch (lex.getCurToken()) {
            case VARNAME:
                lex.nextToken();
                Tree firstNested = F();  //first appear of nested brackets
                return new Tree("T",
                        new Tree("name"),
                        firstNested);
            default:
                errorAlert();
                return null;
        }
    }

    private Tree F() throws ParseException {
        switch (lex.getCurToken()) {
            case LEFT:
                lex.nextToken();
                Tree nested = N();
                check(Token.RIGHT);
                return new Tree("F",
                        new Tree("<"),
                        nested,
                        new Tree(">"));
            case RIGHT:
            case COMA:
                return new Tree("F");
            default:
                errorAlert();
                return null;
        }
    }

    private Tree N() throws ParseException {
        switch (lex.getCurToken()) {
            case VARNAME:
                Tree type = T();
                Tree ending = E();
                return new Tree("N",
                        type,
                        ending);
            default:
                errorAlert();
                return null;
        }
    }

    private Tree E() throws ParseException {
        switch (lex.getCurToken()) {
            case COMA:
                lex.nextToken();
                Tree nested = N();
                return new Tree("E",
                        new Tree(","),
                        nested);
            case RIGHT:
                lex.nextToken();
                return new Tree("E");

            default:
                errorAlert();
                return null;
        }
    }
}
