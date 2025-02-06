import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class schedulethread {
    
    static class MyTask implements Runnable { // Must be static to be used in main
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10); // Fixed name

        // Task to run after a 10-second delay
        service.schedule(new MyTask(), 10, TimeUnit.SECONDS);

        // Task to run repeatedly every 10 seconds (first execution after 15 seconds)
        service.scheduleAtFixedRate(new MyTask(), 15, 10, TimeUnit.SECONDS);

        // Task to run repeatedly 10 seconds after the previous task completes
        service.scheduleWithFixedDelay(new MyTask(), 15, 10, TimeUnit.SECONDS);

        
    }
}
