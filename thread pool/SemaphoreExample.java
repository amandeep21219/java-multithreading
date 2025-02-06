import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    // Create a semaphore with 3 permits 
    private static final Semaphore semaphore = new Semaphore(3);

    public static void main(String[] args) {
        
        int totalThreads = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(totalThreads);

        
        for (int i = 1; i <= 100; i++) {
            executorService.execute(new MyTask());
        }

        
    }

    // Task that each thread will run
    static class MyTask implements Runnable {
        public void run() {
            try {
                
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " has entered the critical section.");

               
                Thread.sleep(1000);  // Simulate work

                System.out.println(Thread.currentThread().getName() + " is leaving the critical section.");
            } catch (InterruptedException e) {
               
            } finally {
                // Release the permit so that other threads can enter
                semaphore.release();
            }
        }
    }
}
