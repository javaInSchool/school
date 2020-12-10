package java11.lesson3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main911_home {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("src/java11/lesson3/input.txt"));
        PrintWriter out = new PrintWriter(new File("src/java11/lesson3/output.txt"));
        double s = in.nextDouble();
        double r1 = in.nextDouble();

        double s1 = Math.PI*r1*r1;
        double s2 = s1 - s;

        double r2 = Math.sqrt(s2/Math.PI);

        out.printf("%.2f",r2);

        out.flush();
        out.close();
    }
}

