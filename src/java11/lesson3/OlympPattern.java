package java11.lesson3;
import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class OlympPattern {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter(new File("output.txt"));

        int n = in.nextInt();
        BigInteger ways = BigInteger.ONE; //початкове значення

        if(n == 0) {
            out.println(1);
        }
        else {
            for(int i = 1; i <=n; i++) {
                ways = ways.multiply(BigInteger.valueOf(i));
            }
            out.println(""+ways);
        }

        out.flush();
        out.close();
    }


}

