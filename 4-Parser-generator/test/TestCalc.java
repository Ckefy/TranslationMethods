/*import calculator.CalculatorLex;
import calculator.CalculatorParser;
import org.junit.Assert;
import org.junit.Test;

public class TestCalc {
    @Test
    public void testFirst() {
        try {
            CalculatorLex lex = new CalculatorLex("210 + 15");
            CalculatorParser parser = new CalculatorParser(lex);
            Assert.assertEquals(225, parser.getvalue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSecond() {
        try {
            CalculatorLex lex = new CalculatorLex("11 * 15");
            CalculatorParser parser = new CalculatorParser(lex);
            Assert.assertEquals(165, parser.getvalue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testThird() {
        try {
            CalculatorLex lex = new CalculatorLex("-5");
            CalculatorParser parser = new CalculatorParser(lex);
            Assert.assertEquals(-5, parser.getvalue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFourth() {
        try {
            CalculatorLex lex = new CalculatorLex("5 - 10");
            CalculatorParser parser = new CalculatorParser(lex);
            Assert.assertEquals(-5, parser.getvalue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSixth() {
        try {
            CalculatorLex lex = new CalculatorLex("10 / 5");
            CalculatorParser parser = new CalculatorParser(lex);
            Assert.assertEquals(2, parser.getvalue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSeventh() {
        try {
            CalculatorLex lex = new CalculatorLex("(2 * (-1) + 5 * 100000)");
            CalculatorParser parser = new CalculatorParser(lex);
            Assert.assertEquals(499998, parser.getvalue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEighth() {
        try {
            CalculatorLex lex = new CalculatorLex("-3 + \n 2 + \n\n 500");
            CalculatorParser parser = new CalculatorParser(lex);
            Assert.assertEquals(499, parser.getvalue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNinth() {
        try {
            CalculatorLex lex = new CalculatorLex("2 ^ 3 ^ 2 ");
            CalculatorParser parser = new CalculatorParser(lex);
            Assert.assertEquals(512, parser.getvalue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNinth2() {
        try {
            CalculatorLex lex = new CalculatorLex("2 ^ 3 ^ 0 ");
            CalculatorParser parser = new CalculatorParser(lex);
            Assert.assertEquals(2, parser.getvalue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTenth() {
        try {
            CalculatorLex lex = new CalculatorLex("2 - 2 - 2 ^ 3 ^ 2 ");
            CalculatorParser parser = new CalculatorParser(lex);
            Assert.assertEquals(-512, parser.getvalue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testEleventh() {
        try {
            CalculatorLex lex = new CalculatorLex("2 / 2 ^ 3 ^ 2 ");
            CalculatorParser parser = new CalculatorParser(lex);
            Assert.assertEquals(1, parser.getvalue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = Exception.class)
    public void testExceptionFirst() throws Exception {
        CalculatorLex lex = new CalculatorLex("kek * 2");
    }

    @Test(expected = Exception.class)
    public void testExceptionSecond() throws Exception {
        CalculatorLex lex = new CalculatorLex("5 * 5 * 5 * ");
        CalculatorParser parser = new CalculatorParser(lex);
    }

    @Test(expected = Exception.class)
    public void testExceptionThird() throws Exception {
        CalculatorLex lex = new CalculatorLex("5 + + 5");
        CalculatorParser parser = new CalculatorParser(lex);
    }
}*/
