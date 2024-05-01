import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class P6_2 {
    public static void main(String[] args) {
        File f = null;
        Boolean b = false;

        try {
            f = new File("C:/DSU/DE-COMPUTER SEM-4/JAVA/PRATICALS/PRATICAL LIST-6/Student1.txt");
            b = f.createNewFile();
            System.out.println("File created :: " + b);

            try (FileWriter fileWriter = new FileWriter(f);
                 BufferedWriter bWriter = new BufferedWriter(fileWriter)) {
                bWriter.write("This is line 1 of the file.\n");
                bWriter.write("This is line 2 of the file.\n");
                bWriter.write("This is line 3 of the file.\n");
                System.out.println("Content has been written to the file.");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
