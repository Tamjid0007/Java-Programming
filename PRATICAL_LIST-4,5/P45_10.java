import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P45_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the file name
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        // Attempt to open the file
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            // Read and print the contents of the file
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close(); // Close the file scanner
        } catch (FileNotFoundException e) {
            // Catch and handle FileNotFoundException
            System.out.println("Error: File not found.");
        }

        scanner.close(); // Close the scanner
    }
}
