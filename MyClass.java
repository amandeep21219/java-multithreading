public class MyClass extends Thread{//set priority of thread
    public MyClass(String name){
        super(name);
        
    }
    public void run(){
        for(int i=0;i<5;i++)
       { System.out.println(Thread.currentThread().getName()+"  priority  "+Thread.currentThread().getPriority());
    Thread.yield();
       }
    
    }
    

    public static void main(String[] args) throws InterruptedException {
        MyClass t1= new MyClass("aman"); 
        MyClass t2= new MyClass("ayush"); 
        MyClass t3= new MyClass("khushi"); 
        MyClass t4= new MyClass("sasaki"); 
        
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        
        t2.start();
        
        t3.start();
        
        t4.start();
        

    }
}