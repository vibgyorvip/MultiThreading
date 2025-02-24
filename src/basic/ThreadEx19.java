package basic;

class MyThread17 extends  Thread{
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            System.out.println("Child Thread");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){}
        }
    }
}
public class ThreadEx19 {
    public static void main(String[] args) {
        MyThread17 t = new MyThread17();
        t.setDaemon(true);
        t.start();
        System.out.println("End of main thread");
    }
}
