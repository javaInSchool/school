package _7_polimorfizm.lesson79;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();

        Animal ac = new Cat();
        Animal ad = new Dog();
        if (ac instanceof Dog) {
            Dog myDog = (Dog) ac; //error
        }
        Dog myDog = (Dog)ad;

        boolean isCat = ac instanceof Cat;
        System.out.println(isCat);

        Dog myDog2 = null;
        System.out.println(myDog2 instanceof Dog);
    }

    static void test(Animal a){

    }
}
