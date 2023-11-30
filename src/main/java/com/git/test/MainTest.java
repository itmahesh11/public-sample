import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainTest {

    @Test
    public void testFileWrite() throws IOException {
        // Arrange
        String fileName = "test.txt";
        String message = "Hello, world!";
        Main main = new Main();

        // Act
        String result = main.test(fileName, message);

        // Assert
        Assertions.assertEquals(message, result);
        Assertions.assertTrue(Files.exists(Path.of(fileName)));

        // Clean up
        File file = new File(fileName);
        file.delete();
    }
}