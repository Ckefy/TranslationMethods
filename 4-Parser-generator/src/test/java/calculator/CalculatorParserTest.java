package test.java.calculator;

import calculator.CalculatorLexicalAnalyzer;
import calculator.CalculatorParser;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorParserTest {
    @Test
    public void testTwoPlusFive() {
        try {
            CalculatorLexicalAnalyzer analyzer = new CalculatorLexicalAnalyzer("2 + 5");
            CalculatorParser parser = new CalculatorParser(analyzer);

            Assert.assertEquals(7, parser.getv());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTwoMulFive() {
        try {
            CalculatorLexicalAnalyzer analyzer = new CalculatorLexicalAnalyzer("2 * 5");
            CalculatorParser parser = new CalculatorParser(analyzer);

            Assert.assertEquals(10, parser.getv());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUnaryMinusSeven() {
        try {
            CalculatorLexicalAnalyzer analyzer = new CalculatorLexicalAnalyzer("-7");
            CalculatorParser parser = new CalculatorParser(analyzer);

            Assert.assertEquals(-7, parser.getv());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFiveMinusFive() {
        try {
            CalculatorLexicalAnalyzer analyzer = new CalculatorLexicalAnalyzer("5 - 5");
            CalculatorParser parser = new CalculatorParser(analyzer);

            Assert.assertEquals(0, parser.getv());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFiveMulZero() {
        try {
            CalculatorLexicalAnalyzer analyzer = new CalculatorLexicalAnalyzer("5 * 0");
            CalculatorParser parser = new CalculatorParser(analyzer);

            Assert.assertEquals(0, parser.getv());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAllRules() {
        try {
            CalculatorLexicalAnalyzer analyzer = new CalculatorLexicalAnalyzer("(-3*(7-4)+2)");
            CalculatorParser parser = new CalculatorParser(analyzer);

            Assert.assertEquals((-3*(7-4)+2), parser.getv());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAllRulesWithSpaces() {
        try {
            CalculatorLexicalAnalyzer analyzer = new CalculatorLexicalAnalyzer("(-3\n*\r\r(7    -  \r\n  4)+\n2)     ");
            CalculatorParser parser = new CalculatorParser(analyzer);

            Assert.assertEquals((-3*(7-4)+2), parser.getv());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = Exception.class)
    public void testLexicalAnalyzerException() throws Exception {
        CalculatorLexicalAnalyzer analyzer = new CalculatorLexicalAnalyzer("1 + a * 178");
    }

    @Test(expected = Exception.class)
    public void testParserExceptionNotEnd() throws Exception {
        CalculatorLexicalAnalyzer analyzer = new CalculatorLexicalAnalyzer("1 + 5 * ");
        CalculatorParser parser = new CalculatorParser(analyzer);
    }

    @Test(expected = Exception.class)
    public void testParserExceptionDoubleMul() throws Exception {
        CalculatorLexicalAnalyzer analyzer = new CalculatorLexicalAnalyzer("1 + 5 * * 10");
        CalculatorParser parser = new CalculatorParser(analyzer);
    }
}
