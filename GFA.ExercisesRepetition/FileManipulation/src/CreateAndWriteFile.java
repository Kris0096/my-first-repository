import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreateAndWriteFile {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add(0, "This is my first line");
        lines.add(1, "seems like this is second line");
        lines.add(2, "I can do as many lines as I want hurray");
        Path pathToTheFile = Paths.get("src/files/my-file.txt");
        try {
            Files.write(pathToTheFile, lines);
        } catch (IOException e) {
            System.out.println("ojojoj");
        }
    }
}
