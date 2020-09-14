package practice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = input.nextInt();
        System.out.print("Введите x: ");
        int x = input.nextInt();

        System.out.println("Предыдущее: " + (--n));
        System.out.println("Следующее: " + (++n+1));
    }
}
