package java11.lesson4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("src/java11/lesson4/input.txt"));
        PrintWriter out = new PrintWriter(new File("src/java11/lesson4/output.txt"));
        int n = in.nextInt(); //прочитать заданное кол-во ярусов с листками
        int sum = 0;
        //sum = sum + 1; // на верху   1 = 1 * 1
        //sum = sum + 2; // на 1 ярусе   2 = 1 * 2
        //sum = sum + 4; // на 2 ярусе   4 = 2 * 2
        //sum = sum + 6; // на 3 ярусе   6 = 3 * 2
        for(int i = 1; i <= n; i++){
            sum = sum + i*2;
            System.out.println(sum);
        }
        //i = 1
        // i < n (1 <= 3)-> sum = 1 + 1*2 = 3
        //i++  -> i=2
        //i = 2
        // i < n (2 <= 3)-> sum = 3 + 2*2 = 7
        // i++
        // i = 3
        // i < n (3 <= 3)-> sum = 7 + 3*2 = 13
        //i++
        //i = 4
        // i <n (4<=3) false

        out.print("" + (sum+1)); // запись результата в файл
        out.flush();
        out.close();
    }
}
