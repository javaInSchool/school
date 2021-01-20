package _7_polimorfizm.lesson72_toString_equals;

public class MainExampleToString {
    public static void main(String[] args) {
        String s = new String("Serg");
        System.out.println(s);
        Swallow sw = new Swallow("Bob");
        System.out.println(sw);
        Swallow sw2 = new Swallow("Tony");
        System.out.println(sw2.toString());
    }
}
