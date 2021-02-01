package _8_interface_innerclass.lesson88_interface;

public abstract class Creature implements Lifeable{
    abstract void say();
}
class Animal extends Creature{
    @Override
    public void live(){
        System.out.println("Animal");
    }
    @Override
    public void say(){
        System.out.println("Dif sounds");
    }
}
class Dog extends Animal{
}
