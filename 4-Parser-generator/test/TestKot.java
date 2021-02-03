/*import kotlinarr.KotlinArrLex;
import kotlinarr.KotlinArrParser;
import org.junit.Test;

public class TestKot {
    @Test
    public void testZero() {
        try {
            KotlinArrLex analyzer = new KotlinArrLex("var x: Array<Int<Int>>;");
            KotlinArrParser parser = new KotlinArrParser(analyzer);
            parser.showTree(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFirst() {
        try {
            KotlinArrLex analyzer = new KotlinArrLex("var x: Array<Int>;");
            KotlinArrParser parser = new KotlinArrParser(analyzer);
            parser.showTree(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSecond() {
        try {
            KotlinArrLex analyzer = new KotlinArrLex("var x: Array<Int<Int, Int>>;");
            KotlinArrParser parser = new KotlinArrParser(analyzer);
            parser.showTree(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testThird() {
        try {
            KotlinArrLex analyzer = new KotlinArrLex("var x: Array<Int<Int, Int<name>>>;");
            KotlinArrParser parser = new KotlinArrParser(analyzer);
            parser.showTree(11);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFourth() {
        try {
            KotlinArrLex analyzer = new KotlinArrLex("var x: Array<Map<Int, Map<a, b, c>>>;");
            KotlinArrParser parser = new KotlinArrParser(analyzer);
            parser.showTree(13);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFifth() {
        try {
            KotlinArrLex analyzer = new KotlinArrLex("var x: Array<Map<Int, a, b, c, d>>;");
            KotlinArrParser parser = new KotlinArrParser(analyzer);
            parser.showTree(14);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = Exception.class)
    public void testExceptionFirst() throws Exception {
        KotlinArrLex analyzer = new KotlinArrLex("var x");
        KotlinArrParser parser = new KotlinArrParser(analyzer);
    }


    @Test(expected = Exception.class)
    public void testExceptionSecond() throws Exception {
        KotlinArrLex analyzer = new KotlinArrLex("var x:<Int>");
        KotlinArrParser parser = new KotlinArrParser(analyzer);
    }


    @Test(expected = Exception.class)
    public void testExceptionThird() throws Exception {
        KotlinArrLex analyzer = new KotlinArrLex("x:<Int>;");
        KotlinArrParser parser = new KotlinArrParser(analyzer);
    }
}*/
