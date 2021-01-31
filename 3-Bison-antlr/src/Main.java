import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        String sourceName = "src\\example.txt";
        try {
            HelloLexer lexer = new HelloLexer(CharStreams.fromFileName(sourceName));
            HelloParser parser = new HelloParser(new CommonTokenStream(lexer));
            HelloTranslator translator = new HelloTranslator();
            new ParseTreeWalker().walk(translator, parser.root());
            System.out.println("Translation is successful");
            int point = sourceName.indexOf('.');
            Path output = Path.of(sourceName.substring(0, point) + ".py");
            Files.deleteIfExists(output);
            Files.createFile(output);
            Files.writeString(output, translator.translate());
            System.out.println("Compilation is successful");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
