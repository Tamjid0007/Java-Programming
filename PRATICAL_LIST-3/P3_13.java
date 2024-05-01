public class P3_13 {
    public static void main(String[] args) 
{
	Circle1 circle1 = new Circle1(5.0, "Red");
        Rectangle1 rectangle1 = new Rectangle1(4.0, 6.0, "Blue");
        Triangle1 triangle1 = new Triangle1(3.0, 4.0, "Green");
	B a1 = new B();
        C b1 = new C(); 
        D c1 = new D();
        F d1 = new F();

        System.out.println("Circle Information:");
        System.out.println(circle1.getInfo());
	a1.area_Circle();
        d1.Perimeter_Circle();
        System.out.println();

        System.out.println("Rectangle Information:");
        System.out.println(rectangle1.getInfo());
	b1.area_Rectangle();
        d1.Perimeter_Rectangle();
        System.out.println();

        System.out.println("Triangle Information:");
        System.out.println(triangle1.getInfo());
	c1.area_Triangle();
        d1.Perimeter_Triangle();
	
    }
}
