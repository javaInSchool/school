package _5_incapsulation.lesson42;

public class Controller {
    int add(int x, int y){
        return x + y;
    }
    void multiply(Calc c){
        c.x = c.x * 2;
        System.out.println(c.x);
    }
}
