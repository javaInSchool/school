package java9.oop;

public class Swallow extends Bird{
    double eat(int n, String name){
        double weight;
        //type your code here
        weight = n * name.length();
        return weight;
    }

}
