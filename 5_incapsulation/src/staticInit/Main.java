package staticInit;
public class Main {
    static int x;
    public static void main(String[] args) {
        System.out.println("x = " + x + " ; " +"y = " + y);
        Main m = new Main();
        System.out.println("x = " + x + " ; " +"y = " + y);
        Animal a = new Animal();
        System.out.println(a.breed + " " + Animal.species);
    }
    static int y;
    static {
        x = 6;
    }
    {
        y = 9;
    }
}

class Animal{

    String breed;
    static String species;
    Animal(){
        System.out.println("Constructor Animal");
        breed = "BullMastif";
    }
    static {species = "Dog";}
    static void display(int marker){
        System.out.println("Animal("+marker+")");
    }
    static Dog dog = new Dog();
}

class Dog{
    Dog(){
        System.out.println("Constructor Dog");
    }
}