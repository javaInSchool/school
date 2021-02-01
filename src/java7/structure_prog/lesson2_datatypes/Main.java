package java7.structure_prog.lesson2_datatypes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число:");
        int x = in.nextInt();
        System.out.println("Вы ввели число: " + x);

        double y = in.nextDouble();
        System.out.println("Вы ввели дробное число: " + y);

        String text = in.next();
        System.out.println("Вы ввели текст: " + text);

    }
}
