package _11_2_regex.split;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = ":";
        String input = "one:two:three:four";

        Pattern p = Pattern.compile(regex);
        String[] items = p.split(input);
        for (String s: items) {
            System.out.println(s);
        }

        String regex2 = "\\d";
        String input2 = "one18two9three7four";
        Pattern p2 = Pattern.compile(regex2);
        String[] items2 = p2.split(input2);
        for (String s: items2) {
            System.out.println(s);
        }
    }
}
