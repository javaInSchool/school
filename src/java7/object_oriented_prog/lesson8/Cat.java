package java7.object_oriented_prog.lesson8;

public class Cat extends Animal {
    String name;
    int years;

    @Override
    void move(){
        System.out.println("Move on 4 paws");
    }
}
