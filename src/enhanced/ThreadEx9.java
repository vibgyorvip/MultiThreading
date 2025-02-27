package enhanced;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {
    String name;

    PrintJob(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "...Job started by Thread:" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        System.out.println(name + "...Job completed by Thread:" + Thread.currentThread().getName());
    }
}

public class ThreadEx9 {
    public static void main(String[] args) {
//        PrintJob r = new PrintJob("Vipul");
//        Thread t = new Thread(r);
//        t.start();

        PrintJob[] jobs = {
                new PrintJob("Ram"),
                new PrintJob("Shyam"),
                new PrintJob("GhanShyam"),
                new PrintJob("Sita"),
                new PrintJob("Om"),
                new PrintJob("Krishna")
        };

        ExecutorService service = Executors.newFixedThreadPool(3);
        for(PrintJob job : jobs){
            service.submit(job);
        }

        service.shutdown();
    }
}
