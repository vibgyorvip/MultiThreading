package basic;

//Defining a Thread by extending Thread class
class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("Child Thread");
        }
    }
}


public class ThreadEx1 {
    public static void main(String[] args) {

        //instantiate a Thread
        MyThread t = new MyThread();
        //start a thread
        t.start();

        for(int i=0; i<10; i++){
            System.out.println("Main Thread");
        }

    }
}
