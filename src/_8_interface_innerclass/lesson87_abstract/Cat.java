package _8_interface_innerclass.lesson87_abstract;

public class Cat extends Animal{
    @Override
    public void say(){
        System.out.println("Meow");
    }

    Cat(){
        System.out.println("Cat constructor");
    }
}
