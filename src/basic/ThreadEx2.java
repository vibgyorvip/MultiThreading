package basic;

//Defining a Thread by implementing Runnable interface
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Child Thread");
    }
}
public class ThreadEx2 {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();

        System.out.println("Main Thread");
    }
}
