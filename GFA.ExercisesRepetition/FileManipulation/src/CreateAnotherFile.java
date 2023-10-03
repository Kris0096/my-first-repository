import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreateAnotherFile {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add(0, "This is actually my really first line I have wrote with java to file by myself");
        Path filePath = Paths.get("src/files/my-new-file.txt");
        try {
            Files.write(filePath, lines);
        } catch (IOException e) {
            System.out.println("ouch could not write the file");
        }

    }
}
