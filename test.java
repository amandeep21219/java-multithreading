public class test {
    public static void main(String[] args) throws InterruptedException {
    counter1 counter1 = new counter1();
    mythread t1 = new mythread(counter1);
    mythread t2 = new mythread(counter1);
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println(counter1.getCount());
}}

