public class thMethods extends Thread {  // Extending Thread class

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "  priority  " + Thread.currentThread().getPriority());
            Thread.yield();  // Yielding control to allow other threads to execute
        }
    }

    public static void main(String[] args) throws InterruptedException {  // Exception handling for InterruptedException
        thMethods t1 = new thMethods();
        thMethods t2 = new thMethods();
t2.setDaemon(true);
        t1.start(); 
        t2.start();  

           
    }
}
