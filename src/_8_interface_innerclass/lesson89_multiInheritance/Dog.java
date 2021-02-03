package _8_interface_innerclass.lesson89_multiInheritance;

public class Dog extends Animal{
    void say(){
        System.out.println("implements from Animal");
    }
    @Override
    public void method1(){
        System.out.println("implements from myInterface");
    }
}
