class counter extends Thread{
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("e");
        }
           
        
    }
    public static void main(String[] args)throws InterruptedException{
        counter s =new counter();
        System.out.println(s.getState());
        s.start();
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(100);
        System.out.println(s.getState());
        s.join();
        System.out.println(s.getState());
        System.out.println(Thread.currentThread().getName());
    }
}
