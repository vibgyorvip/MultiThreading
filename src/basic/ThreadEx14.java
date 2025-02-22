package basic;

class Displey {
    public void wish(String name) {
        ;;;;;;;;;;;;;;;;;;;;; // 1 lakh lines of code
        synchronized (this) {

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

class MyThread13 extends Thread {
    Displey d;
    String name;

    MyThread13(Displey d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}

public class ThreadEx14 {
    public static void main(String[] args) {
        Displey d = new Displey();

        MyThread13 t1 = new MyThread13(d, "vip");
        MyThread13 t2 = new MyThread13(d, "kvt");

        t1.start();
        t2.start();
    }
}
