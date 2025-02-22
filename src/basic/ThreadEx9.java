package basic;

class MyThread7 extends Thread{
    @Override
    public void run() {
        try{
            for (int i=0; i<10; i++){
                System.out.println("Child Thread");
                Thread.sleep(1000);
            }

        }catch (InterruptedException e){
            System.out.println("Child Thread Interrupted");
        }
    }
}
public class ThreadEx9 {
    public static void main(String[] args) {
        MyThread7 t = new MyThread7();
        t.start();

        //interrupt() method can interrupt sleeping thread and waiting thread.
        t.interrupt();//This line will be executed by Main Thread , to interrupt child Thread t .

        System.out.println("End of Main Thread");
    }
}
