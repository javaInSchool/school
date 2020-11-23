package _5_incapsulation.lesson40_static;

public class StaticExample2 {
    int y;
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        //System.out.println(y); //compile error
        StaticExample2 d = new StaticExample2();
        System.out.println(d.y);
    }
}
