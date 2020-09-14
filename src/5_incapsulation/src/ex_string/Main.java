package ex_string;

public class Main {
    public static void main(String[] args) {
        String text = new String(
                        "Lesson on java in 12.00, " +
                                "theme is hello world!");
        System.out.println(text.charAt(2));
        System.out.println(text.indexOf(76));
        System.out.println(text.substring(10));
        String text2 = text.substring(10,14);
        System.out.println(text2);
        String newtext = text.replace(' ', '█');
        System.out.println(newtext);
        newtext = text.replace("java", "C++");
        System.out.println(newtext);
    }
}
