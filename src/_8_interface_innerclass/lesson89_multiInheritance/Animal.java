package _8_interface_innerclass.lesson89_multiInheritance;

public abstract class Animal implements myInteface, otherInterface {
    @Override
    public void method1(){
        System.out.println("implements from myInterface");
    }
    abstract void say();
}
