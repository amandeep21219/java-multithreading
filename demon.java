public class demon implements Runnable {  // Implementing Runnable interface
    
    // Thread 1 task
    public void task1() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " executing task1. Priority: " + Thread.currentThread().getPriority());
            Thread.yield();  // Yield control to allow other threads to execute
        }
    }

    // Thread 2 task
    public void task2() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " executing task2. Priority: " + Thread.currentThread().getPriority());
            Thread.yield();  // Yield control to allow other threads to execute
        }
    }

    // Implementing the run method from Runnable interface
    @Override
    public void run() {
        // Determine which task to perform based on the thread name
        if (Thread.currentThread().getName().equals("Thread-0")) {
            task1();  // Thread 1 executes task1
        } else {
            task2();  // Thread 2 executes task2
        }
    }

    public static void main(String[] args) throws InterruptedException {
        demon task = new demon();  // Creating a single Runnable object for the task
        
        // Creating threads and passing the Runnable task to the threads
        Thread t1 = new Thread(task);  // Thread 1
        Thread t2 = new Thread(task);  // Thread 2

        t2.setDaemon(true);  // Setting t2 as a daemon thread

        t1.start();  // Start t1
        t2.start();  // Start t2

        t1.join();   // Wait for t1 to finish
        t2.join();   // Wait for t2 to finish
    }
}

    

