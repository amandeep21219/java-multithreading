import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    public void run() {
        System.out.println( Thread.currentThread().getName());
    }
}

public class threedfix {
    public static void main(String[] args) {
        int fixedThreads = 10;//could be any number
        ExecutorService ex = Executors.newFixedThreadPool(fixedThreads); 

        for (int i = 1; i <= 100; i++) {  // More tasks than threads
            ex.execute(new MyTask());
        }

        ex.shutdown(); 
    }
}
