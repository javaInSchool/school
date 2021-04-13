package java7.object_oriented_prog.lesson8;

public class Main {
    public static void main(String[] args) {
        /* Animal a = new Animal();
        a.breed = "Asian";
        a.weight = 8; */

        Cat myCat = new Cat();  //  Cat (sub class) is an Animal (super class)
        myCat.breed = "Europian";
        myCat.name = "Mursik";
    }
}
