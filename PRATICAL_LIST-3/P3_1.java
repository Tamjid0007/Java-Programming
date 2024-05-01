class Parent 
{
    	int num = 10;

    	Parent() 
	{
        	System.out.println("Parent class constructor");
    	}

    	void display() 
	{
        	System.out.println("Parent class method");
    	}
}

class Child extends Parent 
{
    	int num = 20;

    	Child() 
	{
        	super(); 
        	System.out.println("Child class constructor");
    	}

    	void display() 
	{
        	super.display(); 
        	System.out.println("Child class method");
    	}

    	void accessVariables() 
	{
        	System.out.println("Parent num: " + super.num); 
        	System.out.println("Child num: " + num);
    	}
}

public class P3_1 
{
    	public static void main(String[] args) 
	{
        	Child obj = new Child();
        	obj.display();
        	obj.accessVariables();
    	}
}
