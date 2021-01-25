package java11.lesson3;

import java.io.File;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Main911_home {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(new File("src/java11/lesson3/input.txt"));
        PrintWriter out = new PrintWriter(new File("src/java11/lesson3/output.txt"));

        int x = 0;
        int y = 0;
        double result = (2*x*x - 4*y*y*y-3) / 2.0*0;
        System.out.println(result);

        out.flush();
        out.close();
    }

}