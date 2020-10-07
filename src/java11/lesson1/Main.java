package java11.lesson1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.out.println("Hello,world!");
        Scanner in = new Scanner(
                new File("src/lesson1/input.txt"));
        PrintWriter out = new PrintWriter(
                new File("src/lesson1/output.txt"));

        int x = in.nextInt(); //прочитать 1 число из файла

        int d = x/10;   // 43 / 10 = 4, целая часть от деления
        int s = x % 10; // 43 % 10 = 3, остаток от деления

        out.print(""+ d + " " +s); // запись результата в файл

        out.flush();
        out.close();
    }
}