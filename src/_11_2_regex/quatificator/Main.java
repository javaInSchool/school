import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //+ >= 1
        //* >= 0
        // ? 0 or 1
        String regex = "ad*";
        String input = "add";

        boolean isMatch = Pattern.matches(regex, input);
        System.out.println(isMatch);

        String s = "Учитель?* Teacher 1%$#42HIDDEN*(3427, java, 78.5, class 516a";
        Pattern p = Pattern.compile("[а-яА-Яa-zA-Z]+");
        Matcher m = p.matcher(s);

        while(m.find()){
            System.out.println(m.start() + " " + m.end() +" " + m.group());
        }
    }
}
