public class counter1 {
    private int count = 0;
    public int getCount() {
        return count;
    }
    public synchronized void incrementCount() {
        count++;
    }
    
}
