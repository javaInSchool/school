package _5_incapsulation.overload2;

public class Main {
    public static void main(String[] args) {
        Calc c = new Calc();

        c.add(5,4);
    }

}

class Calc{
    void add(int x, int y){
        System.out.println(x+y);
    }

    void add(double x, double y){
        System.out.println(x+y);
    }

    void add(int x, double y){
        System.out.println(x*y);
    }

    void add(double x, int y){
        System.out.println(x-y);
    }
}
