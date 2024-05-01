import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P6_3 {
    public static void main(String[] args) {
        File file = new File("Student.txt");

        writeToFile(file);

        modifyFile(file);

        readFromFile(file);
    }

    public static void writeToFile(File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("This is line 1.\n");
            writer.write("This is line 2.\n");
            writer.write("This is line 3.\n");
            System.out.println("Content has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static void modifyFile(File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write("This is an additional line.\n");
            System.out.println("Content has been modified in the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while modifying the file: " + e.getMessage());
        }
    }

    public static void readFromFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("\nReading content from the file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}
