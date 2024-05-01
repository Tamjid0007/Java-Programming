import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P6_7 {
    public static void main(String[] args) {
        String fileName = "myFile.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Data read from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}
