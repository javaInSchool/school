package example2;

public class Main {
    public static void main(String[] args) {
        int y = 5;
        int x = 7;
        boolean z = true;
        z = y<x ? true : false;
        System.out.println(z);

        System.out.println(y<x ? "y меньше" : "y больше");
    }
}
