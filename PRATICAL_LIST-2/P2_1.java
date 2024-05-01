import java.util.Scanner;  

class Test 
{
    	Test(int a, int b) 
	{
        	int c = a + b;
        	System.out.println("The sum is: " + c);
    	}
}

public class P2_1 
{
    	public static void main(String args[]) 
	{
        	int a, b;

        	Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number 1: ");
        	a = sc.nextInt();

        	System.out.print("Enter the number 2: ");
        	b = sc.nextInt();

        	Test obj = new Test(a, b);
    }
}
