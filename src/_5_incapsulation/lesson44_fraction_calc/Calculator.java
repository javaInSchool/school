package _5_incapsulation.lesson44_fraction_calc;

public class Calculator {
    static Fraction add(Fraction f1, Fraction f2){
        Fraction result = new Fraction();
        result.numerator = f1.numerator*f2.denominator +
                           f2.numerator*f1.denominator;
        result.denominator = f1.denominator*f2.denominator;
        return result;
    }
    static Fraction subtruct(Fraction f1, Fraction f2){
        Fraction result = new Fraction();
        //INSERT YOUR CODE HERE
        return result;
    }
    //multiply - //INSERT YOUR CODE HERE
    //divide - //INSERT YOUR CODE HERE

}
