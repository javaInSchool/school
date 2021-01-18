package java11.lesson3;

import java.io.File;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Main911_home {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(new File("src/java11/lesson3/input.txt"));
        PrintWriter out = new PrintWriter(new File("src/java11/lesson3/output.txt"));

        String n = in.next();
        String m = in.next();
        int a = n.charAt(n.length()-1);
        int b = m.charAt(m.length()-1);

        if(a % 2 == 0 && b % 2 == 0 || a % 2 == 1 && b % 2 == 1) {
            out.print("1");
        }else{
            out.print("0");
        }

        out.flush();
        out.close();
    }

}