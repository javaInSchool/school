package _5_incapsulation.lesson45_API_String;

public class Main {
    public static void main(String[] args) {
        String name = "Oleg is the greatest man";
        int n = name.length(); //длинна, кол-во символов в строчке
        System.out.println(n);
        //API - Application Program Interface
        String data = new String();
        String text = new String("Lesson on java in 12.00, " +
                "theme is hello world!");
        System.out.println(name.charAt(2));

        System.out.println(text.indexOf(76));
        System.out.println("IndexOf: "+name.indexOf('g'));
        System.out.println("IndexOf2: " + name.indexOf('g',4));
        System.out.println(name.indexOf("is"));
        System.out.println(name.indexOf("is", 6));

        System.out.println(name.toLowerCase());

        System.out.println(text.substring(10));
        String text2 = text.substring(10,14);
        System.out.println(text2);

        String newtext = text.replace(' ', '█');
        System.out.println(newtext);

        newtext = text.replace("java", "C++");
        System.out.println(newtext);

        Calculator.add(4,7.0);
    }
}
