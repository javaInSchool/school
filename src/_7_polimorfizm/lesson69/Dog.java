package _7_polimorfizm.lesson69;

public class Dog {
    String name;
    int age;

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    Dog(){

    }
    void display(){
        System.out.println(this.name);
    }
}
