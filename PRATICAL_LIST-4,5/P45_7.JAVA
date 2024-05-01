class Thread1 extends Thread {
    public void run() {
        while (true) {
            try {
                System.out.println("Thread-1");
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                System.out.println("Thread-1 interrupted");
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        while (true) {
            try {
                System.out.println("Thread-2");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread-2 interrupted");
            }
        }
    }
}

class Thread3 extends Thread {
    public void run() {
        while (true) {
            try {
                System.out.println("Thread-3");
                Thread.sleep(7500);
            } catch (InterruptedException e) {
                System.out.println("Thread-3 interrupted");
            }
        }
    }
}

public class P45_7 {
    public static void main(String[] args) {
        Thread1 Thread1 = new Thread1();
        Thread2 Thread2 = new Thread2();
        Thread3 Thread3 = new Thread3();
        
        Thread1.start();
        Thread2.start();
        Thread3.start();
    }
}
