import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class ReentrantLocking {
    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println("Outermethod");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Innermethod");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLocking  example = new ReentrantLocking ();
        example.outerMethod();
    }
} 
    

