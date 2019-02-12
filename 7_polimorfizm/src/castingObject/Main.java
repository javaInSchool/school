package castingObject;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        a1 = d;
        a2 = c;

        boolean b = a1 instanceof Dog;
        if(b) {
            Dog d2 = (Dog) a1;
        }
        b = a2 instanceof Dog;
        if(b) {
            Dog d3 = (Dog) a2;
        }else{
            System.out.println("Not compatible types");
        }
    }
}

class Animal{
    int weight = 10;
}

class Dog extends Animal{
    String breed = "Labrador";
}

class Cat extends Animal{
    String name = "Murka";
}