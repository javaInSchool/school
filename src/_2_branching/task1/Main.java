package _2_branching.task1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("src/_2_branching/task1/input.txt"));
        char x = in.next().charAt(0);
        System.out.println(x);

        switch (x){
            case 'Y':
            case 'y':
                System.out.println("Продолжаем программу");
                break;
            case 'N':
            case 'n':
                System.out.println("Завершить программу");
                System.exit(0);
                break;
            default:
                System.out.println("ERROR input");
        }
    }
}
