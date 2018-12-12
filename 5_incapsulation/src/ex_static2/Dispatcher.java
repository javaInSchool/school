package ex_static2;

public class Dispatcher {
    int y;
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        //System.out.println(y); //compile error
        Dispatcher d = new Dispatcher();
        System.out.println(d.y);
    }
}
