import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Producer extends Thread {
    private final Queue<Integer> buffer;
    private final int maxSize;
    private final Random random;

    public Producer(Queue<Integer> buffer, int maxSize) {
        this.buffer = buffer;
        this.maxSize = maxSize;
        this.random = new Random();
    }

    public void run() {
        while (true) {
            synchronized (buffer) {
                while (buffer.size() >= maxSize) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int num = random.nextInt(100); 
                buffer.add(num);
                System.out.println("Produced: " + num);

                buffer.notifyAll();             }

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private final Queue<Integer> buffer;

    public Consumer(Queue<Integer> buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int num = buffer.poll(); 
                double squareRoot = Math.sqrt(num);
                System.out.println("Consumed: " + num + ", Square root: " + squareRoot);

                buffer.notifyAll(); 
            }

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class  P45_13{
    public static void main(String[] args) {
        final int BUFFER_SIZE = 10;
        Queue<Integer> buffer = new LinkedList<>();
        Producer producer = new Producer(buffer, BUFFER_SIZE);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
