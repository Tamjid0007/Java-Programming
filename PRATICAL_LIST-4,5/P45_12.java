class LongRunningTaskThread extends Thread {
    private static final int TOTAL_ITEMS = 10000; // Total number of items to be sorted
    private volatile int progress = 0; 
    public void run() {
        for (int i = 0; i < TOTAL_ITEMS; i++) {
           
            progress++;

            try {
                Thread.sleep(1); // Simulating work
            } catch (InterruptedException e) {
                System.out.println("Task interrupted!");
                return;
            }
        }
    }

    public int getProgress() {
        return progress;
    }

    public int getTotalItems() {
        return TOTAL_ITEMS;
    }
}

class ProgressBarThread extends Thread {
    private LongRunningTaskThread taskThread;

    public ProgressBarThread(LongRunningTaskThread taskThread) {
        this.taskThread = taskThread;
    }

    public void run() {
        int totalItems = taskThread.getTotalItems();

        while (taskThread.getProgress() < totalItems && !isInterrupted()) {
            int progress = taskThread.getProgress();
            int percentage = (int) (((double) progress / totalItems) * 100);

            System.out.print("\rProgress: [" + "#".repeat(percentage / 2) + " ".repeat(50 - percentage / 2) + "] " + percentage + "%");

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("\nProgress bar interrupted!");
                return;
            }
        }
        System.out.println("\nTask completed!");
    }
}

public class P45_12 {
    public static void main(String[] args) {
        LongRunningTaskThread taskThread = new LongRunningTaskThread();
        ProgressBarThread progressBarThread = new ProgressBarThread(taskThread);

        taskThread.start();

        progressBarThread.start();

        try {
            taskThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        progressBarThread.interrupt();
    }
}
