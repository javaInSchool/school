package _7_polimorfizm.lesson77;

public class Main {
    public static void main(String[] args) {

        final Dog myDog = new Dog(10);
        myDog.name = "Rex";
        myDog.name = "Sharik";
        //змінювати поля можна, а посилання на об'єкт ні
        //myDog = new Dog(11); //compile error

        int n2 = (int)Double.NEGATIVE_INFINITY;

    }
}