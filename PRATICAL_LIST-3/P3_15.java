abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

        public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    
    public double calculateArea() {
        return (base * height) / 2;
    }
}

public class  ShapeTester{
    public static void printShapeArea(Shape shape) {
        System.out.println("Area of the shape: " + shape.calculateArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 7.0);
        Triangle triangle = new Triangle(3.0, 5.0);

        printShapeArea(rectangle);
        printShapeArea(triangle);
    }
}
