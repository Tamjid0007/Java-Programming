// Shape1 class
class Shape1 {
    protected String color; // Color attribute is protected to allow access in subclasses

    // Constructor
    public Shape1(String color) {
        this.color = color;
    }

    // Method to get shape information
    public String getInfo() {
        return "Color: " + color;
    }
}

// Circle1 class extending Shape1
class Circle1 extends Shape1 {
    private double radius; // Private attribute specific to Circle1

    // Constructor
    public Circle1(double radius, String color) {
        super(color); // Call superclass constructor to initialize color
        this.radius = radius;
    }

    // Method to get circle information
    @Override
    public String getInfo() {
        return super.getInfo() + ", Radius: " + radius;
    }
}

// Rectangle1 class extending Shape1
class Rectangle1 extends Shape1 {
    private double width; // Private attribute specific to Rectangle1
    private double height; // Private attribute specific to Rectangle1

    // Constructor
    public Rectangle1(double width, double height, String color) {
        super(color); // Call superclass constructor to initialize color
        this.width = width;
        this.height = height;
    }

    // Method to get rectangle information
    @Override
    public String getInfo() {
        return super.getInfo() + ", Width: " + width + ", Height: " + height;
    }
}

// Triangle1 class extending Shape1
class Triangle1 extends Shape1 {
    private double base; // Private attribute specific to Triangle1
    private double height; // Private attribute specific to Triangle1

    // Constructor
    public Triangle1(double base, double height, String color) {
        super(color); // Call superclass constructor to initialize color
        this.base = base;
        this.height = height;
    }

    // Method to get triangle information
    @Override
    public String getInfo() {
        return super.getInfo() + ", Base: " + base + ", Height: " + height;
    }
}

public class P3_12 {
    public static void main(String[] args) {
        Circle1 circle = new Circle1(5.0, "Red");
        Rectangle1 rectangle = new Rectangle1(4.0, 6.0, "Blue");
        Triangle1 triangle = new Triangle1(3.0, 4.0, "Green");

        // Getting information about each shape
        System.out.println("Circle:");
        System.out.println(circle.getInfo());
        System.out.println();

        System.out.println("Rectangle:");
        System.out.println(rectangle.getInfo());
        System.out.println();

        System.out.println("Triangle:");
        System.out.println(triangle.getInfo());
    }
}
