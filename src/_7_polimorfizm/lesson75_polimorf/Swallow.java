package _7_polimorfizm.lesson75_polimorf;

public class Swallow extends Bird {
    void move(){
        super.move();
        System.out.println(" Fly");
    }
    @Override
    Bird createBird(){
        return new Swallow(); //3 тип полиморфизма
    }
}