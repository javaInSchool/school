package _7_polimorfizm.lesson70_super;

public class Dog extends Animal{
    int price;
    String name;
    Dog(int weight, String breed, int price, String name){
        super(weight, breed);  //from class Animal
        this.name = name;       //from class Dog
        this.price = price;     //from class Dog
        //super.breed = breed;
        //super.weight = weight;
    }
    void display(){
        System.out.println("weight in Super class: " + super.getWeight());
        System.out.println("breed in Super class: " + super.getBreed());
        System.out.println("name in Sub class: " +  name);
        System.out.println("price in Sub class: " +  price);
    }
}
