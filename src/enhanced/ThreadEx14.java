package enhanced;
class ParentThread extends Thread{

    public static ThreadLocal tl = new ThreadLocal<>();

    @Override
    public void run() {
        tl.set("pp");
        System.out.println("Parent Thread Value ---"+tl.get());

        ChildThread ct = new ChildThread();
        ct.start();
    }
}

class ChildThread extends Thread{
    @Override
    public void run() {
        System.out.println("Child Thread Value ---"+ParentThread.tl.get());
    }
}
public class ThreadEx14 {
    public static void main(String[] args) {
        ParentThread pt = new ParentThread();
        pt.start();
    }
}
