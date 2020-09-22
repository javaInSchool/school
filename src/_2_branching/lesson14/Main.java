package _2_branching.lesson14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //e-olymp / codewars
        Scanner s = new Scanner(System.in);
        System.out.print("Input integer: "); // ln = line, "\n"
        int x = s.nextInt();
        System.out.println("Your input is " + x);

        System.out.println("Input your name: ");
        String name = s.next();

        if( x % 2 == 0){
            System.out.println("Number " + x + " is even");
        }else{
            System.out.println("Number " + x + " is odd");
        }
        // тоже самое через тернарный оператор
        System.out.println(x % 2 == 0 ? "is even" : "is odd");

        //решение квадратного уравнения a*x*x + b*x + c = 0
        //Math.pow(x,2); - возведение в степень
        //Math.sqrt(x);  - корень квадратный

        System.out.print("Input a: ");
        int a = s.nextInt();
        System.out.print("Input b: ");
        int b = s.nextInt();
        System.out.print("Input c: ");
        int c = s.nextInt();
        double d = a  ;  // формула дискриминанта
        double x1, x2;
        if( d > 0 ){
            //x1 =; // формула для х1
        }
    }
}