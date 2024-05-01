import java.io.*;

public class P6_10 {
    public static void main(String[] args) {
        String fileName = "myData.csv";
        String tempFile = "tempData.csv";
        String nameToUpdate = "David Lee";
        String updatedAge = "21";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith(nameToUpdate)) {
                   
                    String[] parts = line.split(",");
                    parts[1] = updatedAge; 
                    line = String.join(",", parts);
                }
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        File file = new File(fileName);
        if (!file.delete()) {
            System.out.println("Could not delete the original file");
            return;
        }
        File tempFileObj = new File(tempFile);
        if (!tempFileObj.renameTo(file)) {
            System.out.println("Could not rename the temporary file");
        } else {
            System.out.println("Age of 'David Lee' updated to 21 successfully.");
        }
    }
}
