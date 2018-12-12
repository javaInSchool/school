package objects;

public class Dispatcher {
    public static void main(String[] args) {
        int x = 6;
        Car myCar = new Car();
        myCar.model = "Mersedes";
        myCar.price = 10000;
        myCar.move();

        Account a1 = new Account();
        a1.name = "Oleg";
        a1.UAH = 10000000.0;
        Account.courseUSDtoUAH = 28.5;
        System.out.println(a1.UAH / Account.courseUSDtoUAH);
    }
}
