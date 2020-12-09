package _6_inharitance.lesson56;

//import java.lang.Math;  //default import
import _6_inharitance.lesson54.*;
import static _6_inharitance.lesson54.Dog.*;

public class Main {
    public static void main(String[] args) {
        int x = 8;
        int y = 2;
        System.out.println(Math.max(x,y));

        Animal a = new Animal();
        _6_inharitance.lesson56.Animal a1 = new _6_inharitance.lesson56.Animal();

        Dog d = new Dog();
        //Creature c = new Creature();  //error without import
        name = "Rex";
    }
}
