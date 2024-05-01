import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class P6_4{
    public static void main(String[] args) {
        String fileName = "myFile.txt";
        String data = "Hello World!";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
