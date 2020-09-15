package readFile;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(
                new File("src/readFile/input.txt"));
        PrintWriter out = new PrintWriter(
                new File("src/readFile/output.txt"));
        int x = in.nextInt();
        out.print(x);
        out.flush();
        out.close();
    }
}
