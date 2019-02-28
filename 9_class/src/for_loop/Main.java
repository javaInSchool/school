package for_loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        for (int i = x; i<y; i++){
            System.out.println();
        }
    }
}