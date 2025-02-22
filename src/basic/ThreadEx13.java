package basic;

class Displayy{
    public synchronized void displayNumber(){
        for(int i=1; i<=10; i++){
            System.out.print(i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }

    public synchronized void displayChar(){
        for(int i=65; i<=75; i++){
            System.out.print((char)i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}

//Defining a Thread-1 to execute displayNumber() Method of Display Class
class MyThread11 extends Thread{
    Displayy d;
    MyThread11(Displayy d){
        this.d = d;
    }

    @Override
    public void run() {
        d.displayNumber();
    }
}


//Defining a Thread-2 to execute displayChar() Method of Display Class
class MyThread12 extends Thread{
    Displayy d;
    MyThread12(Displayy d){
        this.d = d;
    }

    @Override
    public void run() {
        d.displayChar();
    }
}
public class ThreadEx13 {

    public static void main(String[] args) {
        Displayy d = new Displayy();

        MyThread11 t1 = new MyThread11(d);
        MyThread12 t2 = new MyThread12(d);

        t1.start();
        t2.start();
    }
}
