import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        
        System.out.println("Hello world!");
    
    }
    public String test(String fileName, String message)
    {
        

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
