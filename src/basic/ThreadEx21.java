package basic;

class MyThread18 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Hello world!!");
        }
    }
}
public class ThreadEx21 {
    public static void main(String[] args) {
        MyThread18 t = new MyThread18();
        t.setDaemon(true);
        t.start();
        System.out.println("End of main thread");
    }
}
