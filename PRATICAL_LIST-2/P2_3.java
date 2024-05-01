public class P2_3 
{  
	int id;  
	String name;  
  
	P2_3()
	{  
		id=5;
		name="mohit";
		System.out.println("this a default constructor"); 
		 
	}  
  
	P2_3(int i, String n)
	{  
		id = i;  
		name = n;  
	}  
  
	public static void main(String[] args) 
	{  
		P2_3 s = new P2_3();  
		System.out.println("\nDefault Constructor values: \n");  
		System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);  
  
		System.out.println("\nParameterized Constructor values: \n");  
		P2_3 student = new P2_3(10, "Raz");
  
		System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  
	}  
}