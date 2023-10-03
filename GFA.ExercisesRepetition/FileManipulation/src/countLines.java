import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class countLines {
    // Write a function called countLines() that takes a filename as string as a parameter
// and returns the number of lines the file contains.
// It should return zero if it can't open the file
// and should not raise any error.
    public static void main(String[] args) {
        System.out.println(countLines("src/files/my-file.txt"));
        ;
    }
    public static int countLines(String filePath){
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            /*
            lines.add(3,"Ivetka je blazen");
            Files.write(Paths.get(filePath), lines);

            lines.remove(3);
            Files.write(Paths.get(filePath), lines);
            */
            return (int) lines.size();
        } catch (IOException e) {
            return 0;
        }
    }
}
