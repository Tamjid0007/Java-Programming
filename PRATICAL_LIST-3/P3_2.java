import java.util.Scanner; 
class A 
{
    	int year;
	
    	void get() 
	{
        	Scanner s = new Scanner(System.in);
        	System.out.print("Enter Year::");
        	year = s.nextInt(); 
    	}
}

class B extends A 
{
    	void show() 
	{
        	if(year%4==0)
		{
			System.out.println(year + " is a leap year.");
        	}
		else
		{
			System.out.println(year + " is not a leap year.");    		}
		}
}
}

public class P3_2 
{
    	public static void main(String[] args) 
	{
        	B b1 = new B();
        	b1.get();
        	b1.show();
    	}
}
