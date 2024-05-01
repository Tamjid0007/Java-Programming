class P2_9 
{
    	private String name;
    	private int age;

    	public P2_9(String name, int age) 
	{
        	this.name = name;
        	this.age = age;
    	}

    	public P2_9(P2_9 original) 
	{
        	this.name = original.name;
        	this.age = original.age;
    	}

    	public void displayInfo() 
	{
        	System.out.println("Name: " + name + ", Age: " + age);
    	}

    	public static void main(String[] args) 
	{
        	P2_9 student1 = new P2_9("John", 20);

        	System.out.println("Original Student Information:");
        	student1.displayInfo();

        	P2_9 student2 = new P2_9(student1);

        	System.out.println("\nCopied Student Information:");
        	student2.displayInfo();
    }
}
