public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Division by zero.");
            return Double.NaN; // NaN (Not a Number) to indicate an error
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
        System.out.println("Multiplication: " + calculator.multiply(10, 5));

        double result = calculator.divide(10, 5);
        if (!Double.isNaN(result)) {
            System.out.println("Division: " + result);
        }
    }
}
