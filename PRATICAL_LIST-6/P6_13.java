import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class P6_13 {
    public static void main(String[] args) {
        String directoryName = "myDirectory";
        String fileName = "myFile.txt";

        File directory = new File(directoryName);
        if (!directory.exists()) {
            if (directory.mkdir()) {
                System.out.println("Directory '" + directoryName + "' has been created successfully.");
            } else {
                System.out.println("Failed to create the directory '" + directoryName + "'.");
                return;
            }
        } else {
            System.out.println("Directory '" + directoryName + "' already exists.");
        }

        Path sourcePath = new File(fileName).toPath();
        Path targetPath = new File(directoryName, fileName).toPath();
        try {
            Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File '" + fileName + "' has been moved to the directory '" + directoryName + "'.");
        } catch (IOException e) {
            System.out.println("An error occurred while moving the file: " + e.getMessage());
        }
    }
}
