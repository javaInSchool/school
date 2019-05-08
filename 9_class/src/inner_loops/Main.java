package inner_loops;

import java.util.Scanner;

/*
Teacher 13.03 10:35
 */
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) { //ряды
            System.out.println(i + " ряд");
            for (int j = 1; j <= 4; j++) { //места
                System.out.print(j+" ");
            }
            System.out.println();
        }

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
