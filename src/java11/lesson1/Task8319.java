package java11.lesson1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task8319 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(
                new File("src/java11/lesson1/input.txt"));
        PrintWriter out = new PrintWriter(
                new File("src/java11/lesson1/output.txt"));

        String n = in.nextLine();
        int result = Integer.parseInt(""+n.charAt(1)+
                n.charAt(0)+n.charAt(2));
        out.print("" + result);


        out.flush();
        out.close();
    }
}
