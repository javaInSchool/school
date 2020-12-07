package java11.lesson3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main911_home {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("src/java11/lesson3/input.txt"));
        PrintWriter out = new PrintWriter(new File("src/java11/lesson3/output.txt"));

        long goal = in.nextLong();
        int year = 1;
        int present = 1;
        int sum = present;

        while(goal > sum){
            year++;
            present = present * 2 + year;
            sum = sum + present;
        }
        //1 - 1
        //2 - 1 + 1*2 + 2 = 5
        //3 - 5 + 5*2 + 3 = 12
        //4 - 12 +12*2 + 4 = 40


        out.printf("" + year);

        out.flush();
        out.close();

    }
}
