package _2_branching.lesson14;

public class MainTernaryOpeartor {
    public static void main(String[] args) {
        int y = 5;
        int x = 7;
        boolean z = true;
        z = y<x ? true : false;
        System.out.println(z);

        System.out.println(y<x ? "y меньше" : "y больше");
    }
}
