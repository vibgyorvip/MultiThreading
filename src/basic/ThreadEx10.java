package basic;

class MyThread8 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            System.out.println("I am Lazy Thread_"+i);
        }

        System.out.println("I am entering into Sleeping State");

        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("I got interrupted");
        }
    }
}
public class ThreadEx10 {

    public static void main(String[] args) {
        MyThread8 t = new MyThread8();
        t.start();

        t.interrupt();

        System.out.println("End of Main Thread");
    }
}
