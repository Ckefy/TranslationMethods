package generator;

import calculator.CalculatorLex;
import calculator.CalculatorParser;
import generated.GramParseGramsLexer;
import generated.GramParseGramsParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       try {
            GramParseGramsLexer lexer = new GramParseGramsLexer(CharStreams.fromFileName(args[0]));
            TokenStream tokenStream = new CommonTokenStream(lexer);
            GramParseGramsParser parser = new GramParseGramsParser(tokenStream);
            Grammar grammar = parser.start().gram;
            grammar.constructFirst();
            grammar.constructFollow();
            LexGenerator lexGenerator = new LexGenerator(grammar);
            ParserGenerator parserGenerator = new ParserGenerator(grammar);
            Scanner in = new Scanner(System.in);
            while (true) {
                //2 ^ 3 * 3 ^ 2
                //2147483647
                String str = in.nextLine();
                System.out.println(str);
                CalculatorLex lex = new CalculatorLex(str);
                CalculatorParser parser1 = new CalculatorParser(lex);
                System.out.println(parser1.getvalue());
            }
       } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
