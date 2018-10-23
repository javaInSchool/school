package example3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c;
        int balance=1000,payment=100,rate=18,year=0;
        do {
            balance+=payment;
            double interest = balance*rate/100;
            balance += interest;
            year++;
            System.out.println("Balance is " + balance);
            System.out.println("Are you ready to go to rest?");
            c = s.next().charAt(0);
        }
        while (c=='N');
    }
}