class Rectangle 
{
    	int length;
    	int width;

    	Rectangle(int length, int width) 
	{
        	this.length = length;
        	this.width = width;
    	}

    	void calculateArea() 
	{
        	int area = length * width;
        	System.out.println("Area of the rectangle: " + area);
    	}
}

public class P2_6
{
    	static void RectangleDetails(Rectangle rectangle) 
	{
        	System.out.println("Rectangle Details:");
        	System.out.println("Length: " + rectangle.length);
        	System.out.println("Width: " + rectangle.width);
        	rectangle.calculateArea();  
    	}

    	public static void main(String[] args) 
	{
        	Rectangle myRectangle = new Rectangle(5, 8);

        	printRectangleDetails(myRectangle);
    	}
}
