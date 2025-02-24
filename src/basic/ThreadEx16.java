package basic;

class MyThread15 extends Thread{
    int total =0;

    @Override
    public void run() {
        synchronized (this){
            System.out.println("Child Thread starts calculations");//line-2
            for(int i=1; i<=100; i++){
                total = total + i;
            }
            System.out.println("Child Thread giving the  notification"); //line-3
            this.notify();
        }
    }
}
public class ThreadEx16 {
    public static void main(String[] args) throws InterruptedException {
        MyThread15 t = new MyThread15();
        t.start();
        //Thread.sleep(10000);
        synchronized (t){
            System.out.println("Main Thread trying to call wait() method"); //line-1
            t.wait(); //t.wait(10000);
            System.out.println("Main Thread got notification"); // line-4
            System.out.println(t.total);

        }

    }
}
