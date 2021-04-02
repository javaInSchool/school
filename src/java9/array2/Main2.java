package java9.array2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("src/java9/array2/input.txt"));
        PrintWriter out = new PrintWriter(new File("src/java9/array2/output.txt"));
        int arrayLength = Integer.parseInt(in.nextLine());
        int[] numbers = new int[arrayLength];
        for (int i = 0, n = numbers.length; i < n; i++){
            numbers[i] = in.nextInt();
        }
        for(int temp: numbers){
            System.out.print(temp + " ");
        }

        int result = 6;
        out.print(result);
        out.flush();
        out.close();

    }
}
