package _7_polimorfizm.lesson69;

public class Main {
    public static void main(String[] args) {
        // this  /  super
        // this.  / this()
        Dog myDog = new Dog("Rex", 5);
        myDog.age = 5;
        Dog myDog2 = new Dog();
        System.out.println(myDog2.name + " "+
        myDog2.age);
        myDog.display();
        myDog2.display();

        Figure f = new Figure();
    }
}
