package _7_polimorfizm.lesson75_polimorf;

public class Bird {
    void move(){
        System.out.print("Different moves");
    }
    Bird createBird(){
        return new Bird();
    }
}
