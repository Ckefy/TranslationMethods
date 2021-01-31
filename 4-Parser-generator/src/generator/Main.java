package generator;

import antlr.GrammarForGenerateLexer;
import antlr.GrammarForGenerateParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

public class Main {
    public static void main(String[] args) {
        // /home/polinb/IdeaProjects/MPP/ParserGenerator/CalculatorGrammar
        // /home/polinb/IdeaProjects/MPP/ParserGenerator/FunctionInPascalGrammar
        try {
            GrammarForGenerateLexer lexer = new GrammarForGenerateLexer(CharStreams.fromFileName(args[0]));
            TokenStream tokenStream = new CommonTokenStream(lexer);
            GrammarForGenerateParser parser = new GrammarForGenerateParser(tokenStream);
            Grammar grammar = parser.start().g;
            grammar.constructFirst();
            grammar.constructFollow();
            LexicalAnalyzerGenerator lexicalAnalyzerGenerator = new LexicalAnalyzerGenerator(grammar);
            ParserGenerator parserGenerator = new ParserGenerator(grammar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
