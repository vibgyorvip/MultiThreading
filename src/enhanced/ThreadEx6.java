package enhanced;

import java.util.concurrent.locks.ReentrantLock;

class Display{

    // removed synchronized , using ReentrantLock

    ReentrantLock l = new ReentrantLock();
    public void wish(String name) {

        l.lock();

        for(int i=0; i<10; i++){
            System.out.print("Good Morning :");
            try{
            Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println(name);
        }

        l.unlock();
    }
}

class MyThreadA extends Thread{
    Display d;
    String name;
    MyThreadA(Display d, String name){
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}
public class ThreadEx6 {
    public static void main(String[] args) {
        Display d = new Display();

        MyThreadA t1 = new MyThreadA(d, "Dhoni");
        MyThreadA t2 = new MyThreadA(d, "Yuvraj");
        t1.start();
        t2.start();
    }
}
