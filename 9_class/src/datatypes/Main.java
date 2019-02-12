package datatypes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        byte -  8bit  -128 - +127
        short - 16bit -32000 - +32000
        int -   32bit
        long -  64bit
        float - 32bit
        double  64bit
        */
        int number1 = sc.nextInt();
        int result = number1*number1;
        System.out.println(result);
    }
}