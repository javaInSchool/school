package this_example;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Rex", 5);
        d.displayAge();
        Dog d2 = new Dog("Sharik", 10);
        d2.displayAge();
    }
}

class Dog{
    String name;
    int age;
    Dog (String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayAge(){
        System.out.println(this.age);
    }
}
