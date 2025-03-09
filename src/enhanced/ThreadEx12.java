package enhanced;

//overriding of initialValue() method
public class ThreadEx12 {
    public static void main(String[] args) {

        ThreadLocal tl = new ThreadLocal<>(){
            public Object initialValue(){
                return "abc";
            }
        };

        System.out.println(tl.get());
        tl.set("vipul");
        System.out.println(tl.get());
        tl.remove();
        System.out.println(tl.get());
    }
}
