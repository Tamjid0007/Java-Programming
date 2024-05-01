import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class P6_6 {
    public static void main(String[] args) {
        String fileName = "myFile.txt";
        String data = "Java Programming is awesome!";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine(); // Add a new line
            writer.write(data);
            System.out.println("Data has been appended to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }
}
