package _5_incapsulation.lesson40_static;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car redCar = new Car();
        myCar.price = 4000;
        Car.count = 1;
        myCar.model = "Lada";
        redCar.price = 6000;
        redCar.count = 2; //так неправильно, но не ошибка
        System.out.println(myCar.count);
        System.out.println(redCar.count);
        System.out.println(Car.count);
    }
}
