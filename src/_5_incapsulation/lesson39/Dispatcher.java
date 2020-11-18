package _5_incapsulation.lesson39;

public class Dispatcher {
    public static void main(String[] args) {
        Model m = new Model();
        m.x = 5;
        m.y = 10;
        Model m2 = new Model();
        m2.x = -1;
        m2.y = 3;
        Controller calc = new Controller();
        int result = calc.add(m.x, m.y);
        //System.out.println(result);
        View v = new View();
        v.displayInt(result);
        double r2 = calc.divide(m2.x,m2.y);
        v.displayDouble(r2);
    }
}
