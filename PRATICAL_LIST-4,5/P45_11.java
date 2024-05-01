class ET extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }
}

class OT extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }
}

public class P45_11 {
    public static void main(String[] args) {

        ET et = new ET();
        et.start();

        OT ot = new OT();
        ot.start();
    }
}
