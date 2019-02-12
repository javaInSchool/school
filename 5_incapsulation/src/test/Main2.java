package test;

public class Main2 {
    static char[] c = new char[5];
    static String[] s = new String[5];
    public static void main(String[] args) {
        int i = 0;
        for(char ch: c){
            s[i] += c[i];
            System.out.print(s[i++] + ch);
        }
    }
}
