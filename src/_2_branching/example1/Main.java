package _2_branching.example1;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("src/example1/input.txt"));
        int x = in.nextInt();
        int y = in.nextInt();
        if(x==y){
            System.out.println("Numbers are equals");
        }else if(x>y){
            System.out.println("x > y: " + x + " > " + y);
        }else{
            System.out.println("x < y: " + x + " < " + y);
        }
    }
}
