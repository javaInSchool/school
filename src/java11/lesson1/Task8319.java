package java11.lesson1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8319 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(
                new File("src/java11/lesson1/input.txt") );
        PrintWriter out = new PrintWriter(
                new File("src/java11/lesson1/output.txt") );
        String data = in.nextLine();
        int firstSpaceIndex = data.indexOf(" ");
        int secondSpaceIndex = data.indexOf(" ",firstSpaceIndex+1);
        //System.out.println(firstSpaceIndex + " " + secondSpaceIndex);
        int n1 = Integer.parseInt(data.substring(0,firstSpaceIndex));
        //System.out.println(n1);
        int n2 = Integer.parseInt(data.substring(secondSpaceIndex+1));
        //System.out.println(n2);
        char sign = data.charAt(firstSpaceIndex+1);
        //System.out.println(sign);
        if (sign == '*') {
            out.print(""+(n1*n2));
        }else if(sign == '+'){
            out.print(""+(n1+n2));
        }else if(sign == '-'){
            out.print(""+(n1-n2));
        }else {
            out.print(""+(n1/n2));
        }

        out.flush();
        out.close();
    }
}
