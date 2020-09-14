package ex_static;

public class Dispatcher {
    public static void main(String[] args) {
        Car c = new Car();
        c.model = "BMW";
        c.price = 5000;
        Car.count = 5;
        System.out.println(Car.count);
        c.count = 6;
        System.out.println(c.count);

    }

}


