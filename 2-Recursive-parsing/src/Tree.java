import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree {
    private String node;
    private List<Tree> children;

    public Tree(String node, Tree... children) {
        this.node = node;
        this.children = Arrays.asList(children);
    }

    public Tree(String node) {
        this.node = node;
        this.children = new ArrayList<>();
    }

    void print(int testNumber) {
        final String outDir = System.getProperty("user.dir") + File.separator + "Parsed";
        Path outputFile = Paths.get(outDir + File.separator + "TreeParsed" + testNumber + ".gv");

        if (outputFile.getParent() != null) {
            try {
                Files.createDirectories(outputFile.getParent());
            } catch (IOException e) {
                System.out.println("Couldn't create output file path");
                return;
            }
        }

        try (BufferedWriter writer = Files.newBufferedWriter(outputFile, StandardCharsets.UTF_8)) {
            final String fileStart = "digraph HelloWorld {";
            final String fileEnd = "}";

            writer.write(fileStart);
            printNode(writer, 1, -1);
            writer.write(fileEnd);
        } catch (IOException e) {
            System.out.println("Unable to write to file: " + e.getMessage());
        }
    }

    //return last free ID
    private int printNode(BufferedWriter writer, int curID, int parentID) throws IOException, IOException {
        final String startNode = Integer.toString(curID) + "[label=\"" + node + "\"];";

        writer.write(startNode);
        if (parentID != -1){
            writer.write(Integer.toString(parentID) + " -> " + Integer.toString(curID) + ";");
        }
        int freeID = curID + 1;
        if (!children.isEmpty()) {
            for (Tree child : children) {
                freeID = child.printNode(writer, freeID, curID);
            }
        }
        return freeID;
    }
}
