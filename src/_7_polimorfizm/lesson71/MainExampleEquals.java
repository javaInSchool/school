package _7_polimorfizm.lesson71;

public class MainExampleEquals {
    public static void main(String[] args) {
        String name1 = new String("Oleg");
        String name2 = new String("Oleg");
        String name3 = new String("Jessica");
        System.out.println( name1 == name2);
        System.out.println( name2 == name3);
        System.out.println( name1.equals(name2));

        Dog d1 = new Dog("Rex", 100, "Tax");
        Dog d2 = new Dog("Rex", 100, "Tax");
        Dog d3 = new Dog("Sharik", 0, "Dvor");
        System.out.println( d1 == d2);
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));

        Dog d4 = new Dog("Rex", 200, "Tax");
        System.out.println(d2.equals(d4));


    }
}
