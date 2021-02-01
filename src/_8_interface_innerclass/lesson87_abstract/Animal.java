package _8_interface_innerclass.lesson87_abstract;

public abstract class Animal {
    abstract void say();
    void move(){
        System.out.println("diff");
    }
    Animal(){
        System.out.println("constructor animal");
    }
}
