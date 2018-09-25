package example3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("src/example3/input.txt"));
        int x = in.nextInt(); //take number from file
        int y = in.nextInt(); //another number
        int z = in.nextInt();

        switch (x) {
            case 1:
            case 2:
            case 3:
                System.out.println("x = 4");
            case 4:
                System.out.println("x = от 1 до 3");

            default:
                System.out.println("Another number");
        }

    }
}
