package _2_branching.lesson15;

import java.io.*;
import java.util.Scanner;

public class ReadFromFileExample {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(
                new File("src/_2_branching/lesson15/input.txt"));
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
