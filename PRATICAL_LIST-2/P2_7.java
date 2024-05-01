class P2_7
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) 
	{
		System.out.println("Sum of 9 and 4: " + add(9, 4));
        	System.out.println("Sum of 3, 2, and 1: " + add(3, 2, 1));
	}
}