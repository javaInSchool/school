package inner_loop_practice;
import java.util.Scanner;
/* Teacher 13/03 12:40  */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int space = n-1 ;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        //          " "     "*"
        //* * *     0       3 = 3 - 0
        //  * *     1       2 = 3 - 1
        //    *     2       1 = 3 - 2
    }
}