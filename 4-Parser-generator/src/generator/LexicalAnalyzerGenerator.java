package generator;

import generator.subclasses.TokenItem;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LexicalAnalyzerGenerator {
    private Grammar grammar;

    LexicalAnalyzerGenerator(Grammar grammar) throws IOException {
        this.grammar = grammar;
        Path pathDir = Paths.get("/home/polinb/IdeaProjects/MPP/ParserGenerator");
        pathDir = pathDir.resolve("gen").resolve(grammar.grammarName.toLowerCase());
        Files.createDirectories(pathDir);
        String fileName = grammar.grammarName + "LexicalAnalyzer.java";
        String enumFileName = grammar.grammarName + "Token.java";
        PrintWriter printWriter1 = new PrintWriter(new File(pathDir.toString(), enumFileName));
        printWriter1.write(tokenClassText().toString());
        printWriter1.close();
        PrintWriter printWriter2 = new PrintWriter(new File(pathDir.toString(), fileName));
        printWriter2.write(fileText().toString());
        printWriter2.close();
    }

    private StringBuilder tokenClassText() {
        StringBuilder sb = new StringBuilder();
        sb.append(printString("package " + grammar.grammarName.toLowerCase() + ";", 0));
        // tokens
        sb.append(printString("\npublic enum " + grammar.grammarName + "Token {", 0));
        for (String s : grammar.tokenItems.keySet()) {
            sb.append(printString(s + ",", 1));
        }
        sb.append(printString("_END\n}\n", 1));
        return sb;
    }

    private StringBuilder fileText() {
        StringBuilder sb = new StringBuilder();
        // header
        sb.append(printString("package " + grammar.grammarName.toLowerCase() + ";\n" +
                "import java.util.ArrayList;\n" +
                "import java.util.List;\n" +
                "import java.util.regex.Matcher;\n" +
                "import java.util.regex.Pattern;", 0));
        // class
        sb.append("\n");
        sb.append(printString("public class " + grammar.grammarName + "LexicalAnalyzer {", 0));

        // fields
        sb.append(printString("\tprivate StringBuilder inputSB;\n" +
                "\tprivate List<TokenItem> tokenPatterns = new ArrayList<>();\n" +
                "\tprivate List<TokenItem> skipTokenPatterns = new ArrayList<>();\n" +
                "\tprivate List<" + grammar.grammarName + "Token> tokens = new ArrayList<>();\n" +
                "\tprivate List<String> tokensToString = new ArrayList<>();\n" +
                "\tprivate int currentPosition = 0;\n", 0));

        // constructor
        sb.append(printString("\tpublic " + grammar.grammarName + "LexicalAnalyzer(String input) throws Exception {\n" +
                "\t\tinputSB = new StringBuilder(input);", 0));

        sb.append("\n");

        for (TokenItem item : grammar.tokens) {
            sb.append(printString("tokenPatterns.add(new TokenItem(" + grammar.grammarName + "Token." + item.name + "," + item.pattern + "));", 2));
        }

        sb.append("\n");

        for (TokenItem item : grammar.skipTokens) {
            sb.append(printString("skipTokenPatterns.add(new TokenItem(" + grammar.grammarName + "Token." + item.name + "," + item.pattern + "));", 2));
        }

        sb.append(printString("getTokens();", 2));
        sb.append(printString("}", 1));

        sb.append("\n");
        // methods
        sb.append(printString("" +
                "\tpublic " + grammar.grammarName + "Token getCurrentToken() {\n" +
                "\t\treturn tokens.get(currentPosition);\n" +
                " \t}\n" +
                "\n" +
                "\tpublic String getCurrentTokenString() {\n" +
                "\t\treturn tokensToString.get(currentPosition);\n" +
                "\t}\n" +
                "\n" +
                "\tpublic " + grammar.grammarName + "Token getNextToken() {\n" +
                "\t\treturn tokens.get(++currentPosition);\n" +
                "\t}\n" +
                "\n" +
                "\tprivate void getTokens() throws Exception {\n" +
                "\t\twhile (!(inputSB.length() == 0)) {\n" +
                "\t\t\t" + grammar.grammarName + "Token t = findFirstToken();\n" +
                "\t\t\tif (t != null) {\n" +
                "\t\t\t\ttokens.add(t);\n" +
                "\t\t\t} else if (!findFirstSkipToken()) {\n" +
                "\t\t\t\tthrow new Exception(\"Not find matching with tokens.\");\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t\ttokens.add(" + grammar.grammarName + "Token._END);\n" +
                "\t}\n" +
                "\n" +
                "\tprivate boolean findFirstSkipToken() {\n" +
                "\t\tfor (TokenItem item : skipTokenPatterns) {\n" +
                "\t\t\tMatcher m = item.pattern.matcher(inputSB.toString());\n" +
                "\t\t\tif (m.lookingAt()) {\n" +
                "\t\t\t\tinputSB.delete(0, m.end());\n" +
                "\t\t\t\treturn true;\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t\treturn false;\n" +
                "\t}\n" +
                "\n" +
                "\tprivate " + grammar.grammarName + "Token findFirstToken() {\n" +
                "\t\tfor (TokenItem item : tokenPatterns) {\n" +
                "\t\t\tMatcher m = item.pattern.matcher(inputSB.toString());\n" +
                "\t\t\tif (m.lookingAt()) {\n" +
                "\t\t\t\ttokensToString.add(inputSB.substring(0, m.end()));\n" +
                "\t\t\t\tinputSB.delete(0, m.end());\n" +
                "\t\t\t\treturn item.token;\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t\treturn null;\n" +
                "\t}\n" +
                "\n" +
                "\tprivate static class TokenItem {\n" +
                "\t\t" + grammar.grammarName + "Token token;\n" +
                "\t\tPattern pattern;\n" +
                "\t\tTokenItem(" + grammar.grammarName + "Token token, String s) {\n" +
                "\t\t\tthis.token = token;\n" +
                "\t\t\tpattern = Pattern.compile(s);\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}", 0
        ));
        return sb;
    }

    private StringBuilder printString(String text, int tabs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < tabs; ++i) {
            stringBuilder.append("\t");
        }
        stringBuilder.append(text);
        stringBuilder.append("\n");
        return stringBuilder;
    }
}