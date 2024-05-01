import java.util.Scanner;

class P2_4 
{
	double area;
	P2_4(double r)
	{
	 area= (22*r*r)/7;

	}
   	public static void main(String args[]) 
    	{   
      		Scanner s= new Scanner(System.in);
      		System.out.print("Enter the radius: ");
      		double rad= s.nextDouble();      
      		P2_4   a=new P2_4 (rad);
      		System.out.println("Area of Circle is: " + a.area);      
   	}
}