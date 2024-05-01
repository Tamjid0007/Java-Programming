import java.util.Scanner; 
class A 
{
    	double r,l,b,h,w,a,d,c;
}

class B extends A 
{
    	void area_Circle() 
	{
        	Scanner s = new Scanner(System.in);
		System.out.print("Enter Radius::");
        	r = s.nextDouble();
		double a=3.14*r*r;
		System.out.println("area of circle::"+a);	
        }
}
class C extends A 
{
    	void area_Rectangle() 
	{
        	Scanner s = new Scanner(System.in);
		System.out.print("Enter Length::");
        	l = s.nextDouble();
		System.out.print("Enter Breath::");
        	b = s.nextDouble();
		double a=l*b;
		System.out.println("area of Rectangle::"+a);	
        }
}
class D extends A 
{
    	void area_Triangle() 
	{
        	Scanner s = new Scanner(System.in);
		System.out.print("Enter Breath::");
        	b = s.nextDouble();
		System.out.print("Enter Height::");
        	h = s.nextDouble();
		double a=0.5 * b * h;
		System.out.println("area of Triangle::"+a);	
        }
}



public class P3_9 
{
    	public static void main(String[] args) 
	{
        	B a1 = new B();
		a1.area_Circle();
		C b1 = new C();
        	b1.area_Rectangle();
		D c1 = new D();
        	c1.area_Triangle();
    	}
}
