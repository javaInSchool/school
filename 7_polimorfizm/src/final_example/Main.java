package final_example;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        final int x = 14;
        //x++; //compile error
        System.out.println(x);
    }
}

class Animal{
    void say(){
        System.out.println("Different sounds");
    }
}
class Dog extends Animal{
    @Override
    void say(){
        System.out.println("Aw.. aw..");
    }
}