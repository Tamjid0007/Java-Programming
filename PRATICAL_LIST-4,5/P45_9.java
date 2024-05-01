import java.util.InputMismatchException;
import java.util.Scanner;

public class P45_9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (enter a non-numeric value to stop):");

        while (true) {
            try {
                int num = scanner.nextInt();
                System.out.println("You entered: " + num);
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter only integers. Exiting...");
                break;  
            }
        }

        scanner.close();
    }
}
