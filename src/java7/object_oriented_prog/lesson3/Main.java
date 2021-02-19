package java7.object_oriented_prog.lesson3;

public class Main {
    int number;

    public static void main(String[] args) {
        Main m = new Main();
        m.number = 7;
        System.out.println( m.calculate() );
        System.out.println( m.calculateDouble(3.6, 7.9) );
    }
    // first method
    int calculate(){
        int result = 5 * 6;
        return result;
    }
    //second method
    double calculateDouble(double a, double b){
        return a - b;
    }
}
