package basic;

//Synchronization

class Display{
    public synchronized void  wish(String name){
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

class MyThread9 extends Thread{
    Display d;
    String name;
    MyThread9(Display d, String name){
        this.d=d;
        this.name=name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}
public class ThreadEx11 {

    public static void main(String[] args) {
        Display d = new Display();

        MyThread9 t1 = new MyThread9(d,"Dhoni");
        MyThread9 t2 = new MyThread9(d,"Yuvraj");
        t1.start();
        t2.start();
    }
}
