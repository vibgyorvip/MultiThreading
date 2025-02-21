package basic;

class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("run method executed by Thread : " + Thread.currentThread().getName());
    }
}
public class ThreadEx3 {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        t.start();

        System.out.println("Main method executed by Thread : " + Thread.currentThread().getName());

        Thread.currentThread().setName("Vipul");
        System.out.println("Main Thread name changed to "+Thread.currentThread().getName());
    }
}
