class Counter {
    private int counter = 0;

       public synchronized void increment() {
        counter++;
        System.out.println("Counter: " + counter);
    }
}

class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class P45_1 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new IncrementThread(counter);
        Thread thread2 = new IncrementThread(counter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter Value: " + counter);
    }
}
