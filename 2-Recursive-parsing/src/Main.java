import java.io.*;
import java.text.ParseException;
import java.util.Map;

public class Main {

    private static final Map<Integer, Boolean> testsMap = Map.ofEntries(
            Map.entry(0, true),
            Map.entry(1, true),
            Map.entry(2, false),
            Map.entry(3, false),
            Map.entry(4, false),
            Map.entry(5, false),
            Map.entry(6, false),
            Map.entry(7, false),
            Map.entry(8, false),
            Map.entry(9, false),
            Map.entry(10, true),
            Map.entry(11, true),
            Map.entry(12, false),
            Map.entry(13, true),
            Map.entry(14, true),
            Map.entry(15, false),
            Map.entry(16, false),
            Map.entry(17, false),
            Map.entry(18, true),
            Map.entry(19, true),
            Map.entry(20, false)
            );

    public static void main(String[] args) throws IOException {

        for (int i = 0; i <= 20; i++) {
            String filename = "tests/input" + i + ".in";
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String s = reader.readLine();
            reader.close();
            FileInputStream input = new FileInputStream(filename);
            try {
                System.out.print("Test №" + i + ": " + s + " - expect ");
                if (testsMap.get(i)) {
                    System.out.println("CORRECT parsing. ");
                } else {
                    System.out.println("EXCEPTION handling");
                }
                Tree tree = new SyntAnalyz().parse(input);
                tree.print(i);
                System.out.println("Got the CORRECT parsing in test" + i);
                System.out.println();
            } catch (ParseException e) {
                System.out.println("Got the EXCEPTION handled in test" + i + ": " + e.getMessage());
                System.out.println();
            }
        }
    }

}
