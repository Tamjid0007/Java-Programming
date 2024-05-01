import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class P6_8 {
    public static void main(String[] args) {
        String fileName = "myData.csv";
        String[] data = {
            "Name, Age, Gender",
            "John Doe, 25, Male",
            "John Smith, 30, Female",
            "David Lee, 20, Male"
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
