package _8_interface_innerclass.lesson88_interface.interfaces;

public class Main {
    public static void main(String[] args) {

    }
}

abstract class Animal implements Lifeable, OtherInterface{
    abstract void say();
}

class Dog extends Animal{
    @Override
    void say() {
        System.out.println("Aww, aww");
    }
    @Override
    public void live() {
    }
    @Override
    public void otherMethod() {
    }
}