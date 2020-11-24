package java11.lesson1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task8254 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(
                new File("src/java11/lesson1/input.txt") );
        PrintWriter out = new PrintWriter(
                new File("src/java11/lesson1/output.txt") );
        long n = in.nextInt();
        long m = in.nextInt();
        out.print(""+(n-1)*m*3);

        out.flush();
        out.close();
    }
}
