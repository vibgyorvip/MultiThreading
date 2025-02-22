package basic;

public class ThreadEx8 {
    public static void main(String[] args) throws InterruptedException {
        for(int i=0; i<10; i++){
            System.out.println("Slide_"+i);
            Thread.sleep(1000);
        }
    }
}
