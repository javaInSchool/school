package _5_incapsulation.lesson42;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        //System.out.println(x);
        Controller c = new Controller();
        //c.multiply(x);
        //System.out.println(x);
        Calc n = new Calc();
        n.x = 5;
        System.out.println(n.x);
        c.multiply(n);
        System.out.println(n.x);
    }
}
