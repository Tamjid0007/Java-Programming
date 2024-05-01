import java.util.Scanner; 

class F extends A {
    void Perimeter_Circle() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Radius::");
        r = s.nextDouble();
        double p1=2*3.14*r;
        System.out.println("Perimeter of Circle::"+p1);	
    }
    
    void Perimeter_Rectangle() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Length::");
        l = s.nextDouble();
        System.out.print("Enter Width::");
        w = s.nextDouble();
        double p2=2*(l+w);
        System.out.println("Perimeter of Rectangle::"+p2);	
    }
    
    void Perimeter_Triangle() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter side1::");
        a = s.nextDouble();
        System.out.print("Enter side2::");
        d = s.nextDouble();
        System.out.print("Enter side3::");
        c = s.nextDouble();

        double p3=a+d+c;
        System.out.println("Perimeter of Triangle::"+p3);	
    }
}

public class P3_10 {
    public static void main(String[] args) {
        B a1 = new B();
        C b1 = new C(); 
        D c1 = new D();
        F d1 = new F();

	a1.area_Circle();
        d1.Perimeter_Circle();

	b1.area_Rectangle();
        d1.Perimeter_Rectangle();

	c1.area_Triangle();
        d1.Perimeter_Triangle();
    }
}
