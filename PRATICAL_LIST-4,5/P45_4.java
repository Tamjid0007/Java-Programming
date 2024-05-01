class A extends Thread {
    public void run() {
        System.out.println("Numbers divisible by 3 between 1 and 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Numbers divisible by 5 between 1 and 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class P45_4{
    public static void main(String[] args) {
        A thread1 = new A();
        B thread2 = new B();

        thread1.start();
        thread2.start();

    }
}
