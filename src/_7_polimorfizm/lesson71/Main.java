package _7_polimorfizm.lesson71;

public class Main {
    public static void main(String[] args) {
        Bird b = new Bird();
        Swallow s = new Swallow();
        Pinguin p = new Pinguin();

        b.move();
        s.move();
        p.move();
    }
}
