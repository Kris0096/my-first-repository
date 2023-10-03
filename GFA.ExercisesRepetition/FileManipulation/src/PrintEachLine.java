import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class PrintEachLine {
        public static void main(String[] args) {
                // Write a program that opens a file called "my-file.txt" and prints each
                // line from the file to separate lines on the console.
                // If the program is unable to read the file (for example the file does not exist),
                // it should print the following error message: "Unable to read file: my-file.txt".
                Path filePath = Paths.get("src/files/my-file.txt");
                try {
                        List<String> lines = Files.readAllLines(filePath);
                    //for (int i = 0; i < lines.size(); i++)
                    //System.out.println(lines.size(i));
                    for (String line : lines) {
                            System.out.println(line);
                    }
                } catch (IOException e) {
                        System.out.println("Unable to read file: my-file.txt");
                }
        }
}

