package java9.test;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = null; // byte - 8, short - 16, int - 32, long - 64
        while(true) {
            System.out.println("Введите целое число: ");
            try {
                String text = in.nextLine();
                n = new BigInteger( text );
                break;
            }catch(InputMismatchException | NumberFormatException e){
                System.out.println("Не верный ввод, повторите");
            }finally{
                System.out.println("ввод закончен...");
            }
        }
        System.out.println("Вы ввели : " + n);
    }
}