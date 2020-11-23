package _5_incapsulation.lesson38_objects;

public class Dispatcher {
    public static void main(String[] args) {
        int x = 6;
        Car myCar = new Car();
        myCar.model = "Mersedes";
        myCar.price = 10000;
        myCar.move();

    }
}
