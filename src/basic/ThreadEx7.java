package basic;

//Child Thread has to wait for Main Thread completion
class MyThread5 extends Thread{
   static Thread mt ;
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            try{
                mt.join();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

            System.out.println("Child Thread");
        }
    }
}
public class ThreadEx7 {
    public static void main(String[] args) throws InterruptedException {
        MyThread5.mt = Thread.currentThread();

        MyThread5 t = new MyThread5();
        t.start();

        for (int i=0; i<10; i++){
            System.out.println("Main Thread");
            Thread.sleep(2000);
        }
    }
}
