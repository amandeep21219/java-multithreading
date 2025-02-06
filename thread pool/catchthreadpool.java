import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class MyTask implements Runnable {
    public void run() {
        System.out.println( Thread.currentThread().getName());
    }
}
public class catchthreadpool {
    public static void main(String[] args) {
        
        ExecutorService ex = Executors.newCachedThreadPool(); 

        for (int i = 1; i <= 100; i++) {  // More tasks than threads
            ex.execute(new MyTask());
        }

        
        }
    }                                                   
    
