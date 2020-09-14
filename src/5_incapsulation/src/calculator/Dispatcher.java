package calculator;

import java.util.ArrayList;

public class Dispatcher {
    public static void main(String[] args) {
        Model m = new Model(6,-3);
        Model m2 = new Model();

        //Controller c = new Controller();
        int sum = Controller.add(m.x,m.y);
        int dif = Controller.subtract(6, 2);

        //View v = new View();
        View.display(sum);
        //v.display(Controller.add(m.x,m.y));
        //v.display(dif);

    }
}
