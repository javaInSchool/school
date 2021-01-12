package _7_polimorfizm.lesson71;

public class Dog extends Animal{
    int price;
    String name;
    Dog(int weight, String breed, int price, String name){
        super(weight, breed);
        this.name = name;
        this.price = price;
        //super.breed = breed;
        //super.weight = weight;
    }
}
