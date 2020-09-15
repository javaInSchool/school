package _3_loops.example2;

public class Main {
    public static void main(String[] args) {
        int balance = 10000, goal = 20000;
        int rate = 14, years = 0;
        while(balance<goal){
            balance = balance + balance*rate/100;
            years++;
        }
        System.out.println("Сумму 20000 получим через " +
                years + " лет");
    }
}
