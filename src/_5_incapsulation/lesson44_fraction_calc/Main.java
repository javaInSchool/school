package _5_incapsulation.lesson44_fraction_calc;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(1,3);

        Fraction result = Calculator.add(f1,f2);
        View.display(result);
        View.display(Calculator.add(f1,f2));
        View.display(Calculator.subtruct(f1,f2));
        //INSERT YOUR CODE HERE
        //INSERT YOUR CODE HERE
    }
}
