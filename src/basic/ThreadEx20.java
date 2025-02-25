package basic;

//States of a Thread
public class ThreadEx20 extends Thread{

    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadEx20 t1 = new ThreadEx20();
        System.out.println(t1.getState());//NEW
        t1.start();
        System.out.println(t1.getState());//RUNNABLE (or) READY

        Thread.sleep(100); // so that child will get chance or no need to write this also anyway cpu will get chance to child Thread also

        System.out.println(t1.getState());//TIMED_WAITING

        t1.join();//Main thread will wait for child thread job finished.
        System.out.println(t1.getState());//TERMINATED





    }
}
