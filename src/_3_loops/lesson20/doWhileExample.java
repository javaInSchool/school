package _3_loops.lesson20;

import java.util.Scanner;

public class doWhileExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pass = 0;

        do{
            System.out.println("Input password: " );
            pass = s.nextInt();
        }while( pass != 126);

        System.out.println("Вы успешно вошли в аккаунт!");
    }
}
