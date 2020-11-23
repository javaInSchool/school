package _5_incapsulation.lesson40_static;

public class StaticExample3 {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Oleg";
        a1.UAH = 10000000.0;
        Account.courseUSDtoUAH = 28.5;
        System.out.println(a1.UAH / Account.courseUSDtoUAH);
    }
}
