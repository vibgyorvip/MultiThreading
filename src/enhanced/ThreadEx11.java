package enhanced;

public class ThreadEx11 {
    public static void main(String[] args) {
        ThreadLocal tl = new ThreadLocal<>();

        System.out.println(tl.get()); //null
        tl.set("vipul");
        System.out.println(tl.get()); //vipul
        tl.remove();
        System.out.println(tl.get()); //null
    }
}
