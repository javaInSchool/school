package _7_polimorfizm.lesson69_this;

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
