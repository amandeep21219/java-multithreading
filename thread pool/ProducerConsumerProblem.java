import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        BlockingQueue<Integer> q = new ArrayBlockingQueue<>(5); 

        
        Runnable producer = () -> {
            int item = 0;
            while (true) {
                
                    
                    try {
                        q.put(++item);
                    } catch (InterruptedException e) {
                        
                    } 
                    System.out.println("Produced: " + item);
                
            }
        };

        
        Runnable consumer = () -> {
            while (true) {
              
                    Integer item;
                    try {
                        item = q.take();
                    } catch (InterruptedException e) {
                        
                    } 
                   
                    
               
            }
        };

        
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
