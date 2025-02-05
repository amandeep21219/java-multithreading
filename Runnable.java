public class Runnable {

    public static void main(String[] args) {
        world world = new world();//new state created
        Thread ti=new Thread(world);//new thread created
        ti.start();//thread started runnable state
        for(;;){
        System.out.println("Hello, World!");}
    }
}