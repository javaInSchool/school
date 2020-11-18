package java11.lesson3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main108 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("src/java11/lesson3/input.txt"));
        PrintWriter out = new PrintWriter(new File("src/java11/lesson3/output.txt"));

        int a = in.nextInt(); //прочитал 1-е число 11
        int b = in.nextInt(); //прочитал 2-е число 3
        int c = in.nextInt(); //прочитал 3-е число 7

        //c > b && c < a || c < b && c > a
        //7 > 3 и 7 < 11
        if ( (c > b && c < a) || (c < b && c > a) ){
            out.print(""+c);
        };
        if ( (b > c && b < a) || (b < c && b > a) ){
            out.print(""+b);
        };
        if ( (a > c && a < b) || (a < c && a > b) ){
            out.print(""+a);
        };

        out.flush();
        out.close();
    }
}
