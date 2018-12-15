package task_149;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(new File("src/task_149/output.txt"));
        Scanner in = new Scanner(new File("src/task_149/input.txt"));

        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        for (int i = n-1; i != -1 ; i--) {
            out.print(numbers[i] + " ");
        }

        out.flush();
        out.close();
    }
}
