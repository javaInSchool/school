package _12_javaTech.lesson131;

public class Main {
    public static void main(String[] args) {
        String s = "abcd";  //immutable
        String s2 = s;
        s = s.concat("ef");
        System.out.println(s);
        System.out.println(s2);

        String data = "Serg" + " " + "Ivanov";
    }
}
