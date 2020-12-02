package java11.lesson5;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        do{
            System.out.print("Введите четное число: ");
            n = in.nextInt(); //команда nextInt() - запрашивает у пользовтеля число
        }while(n % 2 != 0); // != - не равно, пока остаток от деления не равен 0 - повторять
        System.out.println("Конец программы. Вы ввели четное число.");
    }
}
