public class P2_15 
{
    	public static void main(String[] args) 
	{
        	int num = 10;
        	Integer wrappedNum = Integer.valueOf(num);

        	System.out.println("Wrapped value: " + wrappedNum);

        	String strValue = "20";
        	int parsedValue = Integer.parseInt(strValue);
        	System.out.println("Parsed value: " + parsedValue);
    	}
}
