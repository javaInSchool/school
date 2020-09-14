package fractionCalc;

public class Calculator {
    Fraction add(Fraction f1, Fraction f2){
        Fraction result = new Fraction();
        result.numerator = f1.numerator*f2.denominator +
                           f2.numerator*f1.denominator;
        result.denominator = f1.denominator*f2.denominator;
        return result;
    }
    Fraction subtruct(Fraction f1, Fraction f2){
        Fraction result = new Fraction();
        return result;
    }
    //multiply
    //divide
}
