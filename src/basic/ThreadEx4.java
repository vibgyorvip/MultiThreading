package basic;

class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("Child Thread");
        }
    }
}
public class ThreadEx4 {
    public static void main(String[] args) {
        //Main Thread Priority = 5

        MyThread2 t = new MyThread2();

        t.setPriority(10); // Child Thread Priority = 10 == High
        t.start();

        for(int i=0; i<10; i++){
            System.out.println("Main Thread");
        }
    }
}
