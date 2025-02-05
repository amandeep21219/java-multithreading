public class mythread extends Thread{
    private counter1 counter;
    mythread(counter1 counter){
        this.counter=counter;
    }
    public void run(){
        for(int i=0;i<1000;i++)
       { counter.incrementCount();}
     
    }

    
}
