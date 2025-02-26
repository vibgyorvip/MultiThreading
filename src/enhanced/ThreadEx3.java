package enhanced;

class MyThread extends Thread{
    MyThread(ThreadGroup g, String name){
        super(g, name);
    }

    @Override
    public void run() {
        System.out.println("Child Thread");
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){}
    }
}
public class ThreadEx3 {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup pg = new ThreadGroup("Parent Group");
        ThreadGroup cg = new ThreadGroup(pg, "Child Group");
        MyThread t1 = new MyThread(pg, "Child Thread-1");
        MyThread t2 = new MyThread(pg, "Child Thread-2");

        t1.start();
        t2.start();

        System.out.println("Active Thread Count : "+pg.activeCount()); //2
        System.out.println("Active Group Count : "+pg.activeGroupCount()); //1
        pg.list();

        Thread.sleep(10000);

        System.out.println("Active Thread Count : "+pg.activeCount()); //0
        System.out.println("Active Group Count : "+pg.activeGroupCount()); //1
        pg.list();
    }


}
