package basic;

//Waiting Main Thread until completing Child Thread
class MyThread4 extends Thread{
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println("Child Thread");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
public class ThreadEx6 {
    public static void main(String[] args) throws InterruptedException {

        MyThread4 t = new MyThread4();
        t.start();
        t.join(); // Main Thread will call t.join() that means Main Thread has to wait until complete t thread /Child Thread.
        //t.join(10000); // Main Thread has to wait until 10 sec for child Thread.

        for (int i=0; i<10; i++){
            System.out.println("Main Thread");
        }
    }
}
