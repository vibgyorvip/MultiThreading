package basic;

class MyThreadC extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("Child Thread");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){}
        }
    }
}
public class ThreadEx22 {
    public static void main(String[] args) {
        MyThreadC c = new MyThreadC();
        c.start();

        System.out.println("End of Main Thread");

        //How a Thread can stop by another Thread but not recommendable using stop() method
        c.stop();

        //suspend and resume of a thread
        c.suspend();
        c.resume();
    }

}
