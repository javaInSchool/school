package java11.lesson3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main911_home {
    public static void main(String[] args) throws IOException {
                Scanner in = new Scanner(new File("input.txt"));
                PrintWriter out = new PrintWriter(new File("output.txt"));

                int x1 =in.nextInt();
                int y1 =in.nextInt();
                int x2 =in.nextInt();
                int y2 =in.nextInt();

                int x3 =in.nextInt();
                int y3 =in.nextInt();
                int x4 =in.nextInt();
                int y4 =in.nextInt();

                int x =in.nextInt();
                int y =in.nextInt();

                boolean onWhite = (x3 < x && x < x4 && y4 < y && y < y3);
                boolean onBlack = (x1 <= x && x <= x2 && y2 <= y && y <= y1);

                if(onWhite){
                    out.print("SAD");
                }else if(onBlack){
                    out.print("HAPPY");
                }else{
                    out.print("SAD");
                }

        out.flush();
        out.close();
    }
}

