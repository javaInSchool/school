package objects;

public class Car {
    String model;
    int price;
    int speed;
    Engine e;
    Wheel[] w;

    void move(){
        System.out.println("Car moving...");
    }
}
