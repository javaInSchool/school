package super_example;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog(300, 4);
        d.show();
    }
}

class Animal{
    private int age;
    Animal(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}

class Dog extends Animal{
    private int price;
    Dog (int price, int age) {
        super(age); //age  from class Animal
        this.price = price;          //price from class Dog
    }
    void show(){
        System.out.println("age в суперклассе: " + super.getAge());
        System.out.println("price в подклассе: " +  price);
    }
}
