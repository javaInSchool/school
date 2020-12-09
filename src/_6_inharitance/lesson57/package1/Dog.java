package _6_inharitance.lesson57.package1;

import _6_inharitance.lesson57.package2.Animal;

public class Dog extends Animal {
    //public int x;
    //int y;
    //protected int z;
    private int a;

    public void setVar(){
        a = 5;
    }

    void setVarAnotherPack(){
        Dog d = new Dog();
        d.x = 8;
        d.z = 4;
    }
}
