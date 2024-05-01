// Shape interface
 interface Shape {
    // Method to calculate area
    double getArea();

    // Method to calculate perimeter
    double getPerimeter();
}

// Rectangle class implementing the Shape interface
 class Rectangle implements Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementation of getArea method for Rectangle
    @Override
    public double getArea() {
        return width * height;
    }

    // Implementation of getPerimeter method for Rectangle
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

// Main class for testing
public class P3_18 {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Print the area and perimeter of the rectangle
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());
    }
}
