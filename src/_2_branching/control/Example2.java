package _2_branching.control;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите х: ");
        int x = s.nextInt();

        if( x < -1){
            System.out.println("f(" + x + ") = " + (2*x) );
        }else if ( -1 <= x & x <= 10){
            System.out.println("f(" + x + ") = " +Math.sin(x) );
        }else {
            System.out.println("f(" + x + ") = " + (x+1)/x);
        }
    }
}
