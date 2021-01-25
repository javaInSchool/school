package _7_polimorfizm.lesson76;

public class Dog extends Animal{
    String name;
    int price;
    final int birthday;
    static final String BREED = "Staf";

    Dog(int birthday){
        this.birthday = birthday;
    }

    @Override
    public void say(){
        System.out.println("woof, woof");
    }
}
