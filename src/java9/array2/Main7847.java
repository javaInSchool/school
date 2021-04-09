package java9.array2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main7847 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("src/java9/array2/input.txt"));
        PrintWriter out = new PrintWriter(new File("src/java9/array2/output.txt"));

        int n = Integer.parseInt(in.nextLine());
        int[] array = new int[ n ];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            //System.out.print(array[i] + " ");
        }
        //int[] array = {3, 5, -7, 7, 5, -9, -4};

        int b = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++){
                if (array[j] == array[i]){
                    b++; break;
                }
            }
            //result = n - b;
        }
        out.write("" + (n-b) );
        out.flush();
        out.close();
    }
}
