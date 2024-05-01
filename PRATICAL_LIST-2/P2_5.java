import java.util.Scanner;

class P2_5 
{
	int a, b;

    	P2_5(int a, int b) 
	{
        	this.a = a;
        	this.b = b;
    	}

    	void calculateSubtraction() 
	{
        	int subtraction = a - b;
        	System.out.println("\nThe subtraction of " + a + " and " + b + " is: " +subtraction);
    	}

    	public static void main(String args[]) 
	{
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the number 1: ");
        	int num1 = sc.nextInt();

        	System.out.print("Enter the number 2: ");
        	int num2 = sc.nextInt();

        	P2_5 obj = new P2_5(num1, num2);

        	obj.calculateSubtraction();
    	}
}
