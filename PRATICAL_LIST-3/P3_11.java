// Shape class
class Shape {
    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Getter method for color
    public String getColor() {
        return color;
    }
}

// Circle class
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius, String color) {
        super(color); // Call superclass constructor to initialize color
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height, String color) {
        super(color); // Call superclass constructor to initialize color
        this.width = width;
        this.height = height;
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Getter method for height
    public double getHeight() {
        return height;
    }

    // Method to calculate area
    public double calculateArea() {
        return width * height;
    }
}

// Triangle class
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height, String color) {
        super(color); // Call superclass constructor to initialize color
        this.base = base;
        this.height = height;
    }

    // Getter method for base
    public double getBase() {
        return base;
    }

    // Getter method for height
    public double getHeight() {
        return height;
    }

    // Method to calculate area
    public double calculateArea() {
        return (base * height) / 2;
    }
}

public class P3_11 {
    public static void main(String[] args) {
        // Creating objects of each shape
        Circle circle = new Circle(5.0, "Red");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue");
        Triangle triangle = new Triangle(3.0, 4.0, "Green");

        // Getting information about each shape
        System.out.println("Circle:");
        System.out.println("Color: " + circle.getColor());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println();

        System.out.println("Rectangle:");
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println();

        System.out.println("Triangle:");
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Base: " + triangle.getBase());
        System.out.println("Height: " + triangle.getHeight());
        System.out.println("Area: " + triangle.calculateArea());
    }
}
