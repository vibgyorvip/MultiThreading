package enhanced;

public class ThreadEx2 {
    public static void main(String[] args) {
        ThreadGroup g1 = new ThreadGroup("tg"); //max-priority=10

        Thread t1 = new Thread(g1, "Thread1"); //default-priority=5
        Thread t2 = new Thread(g1, "Thread2"); //default-priority=5

        g1.setMaxPriority(3);

        Thread t3 = new Thread(g1, "Thread3");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());


    }

}
