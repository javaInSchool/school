package task_6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner in = new Scanner(new File("src/task_6/input.txt"));
        PrintWriter out = new PrintWriter(new File("src/task_6/output.txt"));

        String n = in.nextLine();
        String patternString = "[A-H][1-8]-[A-H][1-8]";

        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher = pattern.matcher(n);

        if(!matcher.matches()){
            out.println("ERROR");
        }else if(Math.abs(n.charAt(0) - n.charAt(3)) == 2 &&
                 Math.abs(n.charAt(1) - n.charAt(4)) == 1 ||
                 Math.abs(n.charAt(0) - n.charAt(3)) == 1 &&
                 Math.abs(n.charAt(1) - n.charAt(4)) == 2){
            out.println("YES");
        }else {
            out.println("NO");
        }
        out.flush();
        out.close();
    }
}
