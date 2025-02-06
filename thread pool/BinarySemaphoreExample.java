import java.util.concurrent.Semaphore;

class BinarySemaphoreExample {
    private static final Semaphore semaphore = new Semaphore(1); // Binary semaphore (0 or 1)

    public static void main(String[] args) {
        // Two threads trying to access the critical section
        Thread thread1 = new Thread(new MyTask(), "T1");
        Thread thread2 = new Thread(new MyTask(), "T2");

        thread1.start();
        thread2.start();
    }

    static class MyTask implements Runnable {
        public void run() {
            try {
                // Trying to acquire the semaphore
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " is in critical section.");

                // Simulating work inside the critical section
                Thread.sleep(1000);

                // Exiting the critical section
                System.out.println(Thread.currentThread().getName() + "  leaves the critical section.");
            } catch (InterruptedException e) {
                
            } finally {
                
                semaphore.release();
            }
        }
    }
}
