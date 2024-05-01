package b;
import a.P3_6_1;

public class P3_6_2 extends P3_6_1 {
    
    protected void printMessage() {
        System.out.println("World");
    }

    
    public void fun() {
        printMessage();
    }

    public static void main(String[] args) {
        P3_6_1 p1 = new P3_6_1();
        p1.fun();
        P3_6_2 p2 = new P3_6_2();
        p2.fun();
    }
}
