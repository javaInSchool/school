package java9.oop;

public class Main {
    public static void main(String[] args) {
        Swallow s = new Swallow();
        double dW = s.eat(4,"Fly");
        System.out.println(dW);
        System.out.println( s.eat(4,"Fly") );
    }
}
