package basic;

class MyThread16 extends Thread {

}
public class ThreadEx18 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        //Thread.currentThread().setDaemon(true); // IllegalThreadStateException

        MyThread16 t = new MyThread16();
        System.out.println(t.isDaemon());
        t.setDaemon(true);
        System.out.println(t.isDaemon());
    }
}
