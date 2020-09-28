package _2_branching.lesson15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char answer = s.next().charAt(0); // first char from String
        switch (answer){
            case 'Y':
                //System.out.println("Yes");
                //break;
            case 'y':
                System.out.println("Yes");
                break;
            case 'N' :
                System.out.println("No");
                break;
            default:
                System.out.println("Wrong char");
        }

        // Not, and , or
        boolean a = true; // false
        boolean b = true;

        System.out.println(!a); // ! - not
        System.out.println( a & b); // & - and
        System.out.println( a | b); // | - or
        System.out.println( 4 > 6  && b); // && - and
        System.out.println( a || b);  //|| - or

        boolean z = true;
        z &= a;  // z = z & a;

    }
}
