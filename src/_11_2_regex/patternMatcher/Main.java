import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = "Teacher 127, java, 78.5, class 516";
        Scanner sc = new Scanner(System.in);
        Pattern p2 = Pattern.compile(sc.nextLine(), Pattern.CASE_INSENSITIVE);
        sc.close();
        Matcher m = p2.matcher(s);

        while(m.find()){
            System.out.println(m.start() + " " + m.end() +" " + m.group());
        }
    }
}
