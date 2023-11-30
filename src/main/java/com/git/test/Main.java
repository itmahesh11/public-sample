import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public String test(String fileName, String message)
    {
        System.out.println("Hello world!");

        // File write program
        String filePath = fileName;
        String content = message;

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage());
        }

        return message;

    }
}