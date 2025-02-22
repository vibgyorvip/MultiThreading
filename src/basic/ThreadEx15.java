package basic;

class Monitor {
    public void wish(String name) {
        ;;;;;;;;;;;;;;;;;;;;; // 1 lakh lines of code
        synchronized (Monitor.class) { // Class level lock

            for (int i = 1; i <= 10; i++) {
                System.out.print("Good Morning: ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }

                System.out.println(name);
            }
        }

        ;;;;;;;;;;;;;;;;;;;;; // 1 lakh lines of code
    }
}

class MyThread14 extends Thread {
    Monitor d;
    String name;

    MyThread14(Monitor d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}

public class ThreadEx15 {
    public static void main(String[] args) {
        Monitor d1 = new Monitor();
        Monitor d2 = new Monitor();

        MyThread14 t1 = new MyThread14(d1, "vip");
        MyThread14 t2 = new MyThread14(d2, "kvt");

        t1.start();
        t2.start();
    }
}
