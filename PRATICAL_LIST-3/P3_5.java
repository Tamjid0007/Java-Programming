class A 
{
    public void displayA() 
	{
        	System.out.println("class A method");
    	}
}

class B extends A 
{ 
    	public void displayB() 
	{
        	System.out.println("class B method");
    	}
}

class C extends B 
{ 
    	public void displayC() 
	{
        	System.out.println("class C method");
    	}
}

public class P3_5 
{
    	public static void main(String[] args) 
	{
        	B b = new B();
        	C c = new C();
        	        
        b.displayA(); 
        b.displayB();
        
        c.displayA(); 
        c.displayB();
        c.displayC();
        
    }
}
