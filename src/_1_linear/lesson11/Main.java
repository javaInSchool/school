package _1_linear.lesson11;

public class Main {
    public static void main(String[] args) {
        int x = 7;
        x = x + 1;
        System.out.println(x);
        x += 1;
        System.out.println(x);
        x++;
        System.out.println(x); //10

        int y = x++; //postfix
        System.out.println("y = " + y);
        System.out.println("x = " +x);

        int z = ++x;
        System.out.println("z = " + z);
        System.out.println("x = " +x);

        byte a = 12;
        a++;
        //a = a + 1; //compile error

        int s = x++ + ++y;//y=10, x =12 s = 23, 12
        System.out.println("s = " + s);

        char c = 'A';
        char c2 = 42;
        char c3 = '\u0041';
        char c4 = '\n';
        System.out.println(c);
        System.out.println(c3);
        byte b = (byte)136;
        System.out.println(b);
    }
}
