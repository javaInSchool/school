package java11.lesson1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task5175 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(
                new File("src/java11/lesson1/input.txt") );
        PrintWriter out = new PrintWriter(
                new File("src/java11/lesson1/output.txt") );
        int n = in.nextInt(); //прочитать из файла и записать в перем.

        int y = n % 10;  // 456 % 10 = 6, пример еще 5 % 3 = 2

        out.print("" + y);

        out.flush();
        out.close();
    }
}
