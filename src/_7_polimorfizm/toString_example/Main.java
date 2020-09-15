package toString_example;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Rex", "Collie", 4);
        System.out.println(d.toString());
    }
}

class Dog{
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "my Dog " + name;
    }
}