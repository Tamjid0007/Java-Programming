class A extends Thread {
    public void run() {
        System.out.println("Even numbers from 1 to 50:");
        for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
        }
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Odd numbers from 1 to 50:");
        for (int i = 1; i <= 50; i += 2) {
            System.out.println(i);
        }
    }
}

public class P45_6{
    public static void main(String[] args) {
        A evenThread = new A();
        B oddThread = new B();

        evenThread.start();
        oddThread.start();
    }
}
