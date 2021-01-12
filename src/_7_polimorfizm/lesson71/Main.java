package _7_polimorfizm.lesson71;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(3,
                "Tax", 100,
                "Rex");
        System.out.println(myDog.weight + " " +
                myDog.breed + " " +
                myDog.price + " " +
                myDog.name );
    }
}
