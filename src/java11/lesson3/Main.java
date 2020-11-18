package java11.lesson3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("src/java11/lesson3/input.txt"));
        PrintWriter out = new PrintWriter(new File("src/java11/lesson3/output.txt"));

        int disks = in.nextInt(); //прочитать 1 число из файла

        int hundred = disks / 100; //кол-во сотен дисков 2324 / 100 = 23 сотни
        disks = disks - hundred * 100; //2324 - 23 * 100 = 24
        int twenty = disks / 20;  //кол-во пачек по 20 дисков 24 / 20 = 1 двадцатка
        disks = disks - twenty*20; //24 - 1*20 = 4

        out.print(""+(hundred*100 + twenty*30 + disks*2) ); // запись результата в файл
        out.flush();
        out.close();
    }
}