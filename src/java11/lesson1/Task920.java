package java11.lesson1;

import java.io.*;
import java.util.Scanner;

public class Task920 {
    public static void main (String[] args) throws Exception {

        Scanner in = new Scanner(
                new File("src/java11/lesson1/input.txt") );
        PrintWriter out = new PrintWriter(
                new File("src/java11/lesson1/output.txt") );

        double x, y, z, min2, max2, max3, n;
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        max2 = Math.max(x,y); //нахождение максимума из x и y
        max3 = Math.max(y,z); //нахождение максимума из y и z
        min2 = Math.min(max2,max3); //поиск минимума из найденных максимумов
        n = x + y + z; //сумма 3 заданных чисел
        min2 = Math.min(min2,n); //нахождение данного минимума

        out.printf("%.2f",min2);

        out.flush();
        out.close();

    }
}
