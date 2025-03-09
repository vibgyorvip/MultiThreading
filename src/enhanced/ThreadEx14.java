package enhanced;
class ParentThread extends Thread{

    public static InheritableThreadLocal tl = new InheritableThreadLocal(){
        @Override
        protected Object childValue(Object p) {
            return "CC";
        }
    };

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
