import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class P6_1 {
    public static void main(String[] args) {
        File f = null;
        Boolean b = false;

        try {
            f = new File("C:/DSU/DE-COMPUTER SEM-4/JAVA/PRATICALS/PRATICAL LIST-6/Student.txt");
            b = f.createNewFile();
            System.out.println("File created :: " + b);

           
            try (FileReader fileReader = new FileReader("Student.txt");
                 BufferedReader bReader = new BufferedReader(fileReader)) {
                String line;
                System.out.println("\nReading content from the file:");
                while ((line = bReader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
