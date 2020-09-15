package calculator;

public class Model {
    int x;
    int y;
    Model(int r, int t){
        x = r;
        y = t;
    }
    Model(){
        System.out.println("Empty");
    }
    Model(int h){
        x = h;
    }
}
