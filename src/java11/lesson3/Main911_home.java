package java11.lesson3;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main911_home {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(new File("src/java11/lesson3/input.txt"));
        PrintWriter out = new PrintWriter(new File("src/java11/lesson3/output.txt"));

        int a = in.nextInt();
        int b = in.nextInt();
        out.print(a * b);

        out.flush();
        out.close();
    }

}