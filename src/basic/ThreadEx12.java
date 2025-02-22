package basic;

//Synchronization - Class -level lock

class Disp{
    public static synchronized void  wish(String name){
        for(int i=0; i<10; i++){
            System.out.print("Good Morning : ");

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Interrupted");
            }
            System.out.println(name);
        }

    }
}

class MyThread10 extends Thread{
    Disp d;
    String name;
    MyThread10(Disp d, String name){
        this.d=d;
        this.name=name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}
public class ThreadEx12 {

    public static void main(String[] args) {
        Disp d1 = new Disp();
        Disp d2 = new Disp();

        MyThread10 t1 = new MyThread10(d1,"Dhoni");
        MyThread10 t2 = new MyThread10(d2,"Yuvraj");
        t1.start();
        t2.start();
    }
}
