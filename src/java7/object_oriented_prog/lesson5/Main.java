package object_oriented_prog.lesson5;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 9;
        Calculator c = new Calculator();

        int result = c.add(x,y);
        System.out.println(result);

        result = c.sub(9,3);
        System.out.println(result);

        System.out.println(c.multy(8,7));

        System.out.println(c.div(55,8));
    }
}
