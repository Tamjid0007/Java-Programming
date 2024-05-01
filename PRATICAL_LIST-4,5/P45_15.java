import java.util.InputMismatchException;
import java.util.Scanner;

public class P45_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidInput = false;
        
        do {
            try {
                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();
                
                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();
                
                double result = divideNumbers(num1, num2);
                System.out.println("Result of division: " + result);
                
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter numeric values only.");
                scanner.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero. Please enter a non-zero divisor.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                System.exit(1);
            }
        } while (!isValidInput);
        
        scanner.close();
    }

    public static double divideNumbers(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero error");
        }
        return (double) num1 / num2;
    }
}
