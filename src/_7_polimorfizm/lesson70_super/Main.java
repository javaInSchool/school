package _7_polimorfizm.lesson70_super;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(3,
                "Tax", 100,
                "Rex");
        System.out.println(myDog.getWeight() + " " +
                myDog.getBreed() + " " +
                myDog.price + " " +
                myDog.name );

        myDog.display();

        Empty e = new Empty();
    }
}