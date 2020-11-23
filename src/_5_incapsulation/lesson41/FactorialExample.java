package _5_incapsulation.lesson41;

public class FactorialExample {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return factorial(n-1)*n;
    }
}
