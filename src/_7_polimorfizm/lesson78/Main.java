package _7_polimorfizm.lesson78;

public class Main {
    public static void main(String[] args) {
        Object o = new Object();
        int hCode = o.hashCode();
        System.out.println(hCode);

        Dog d1 = new Dog(3,"Rex");
        Dog d2 = new Dog(3,"Rex");
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());

    }
}
