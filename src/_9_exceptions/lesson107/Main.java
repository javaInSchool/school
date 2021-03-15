package _9_exceptions.lesson107;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program starts");
        try{
            System.out.println("Before method1 calling");
            method1();
            System.out.println("After method1 calling. Never will be shown");
        } catch(Exception e){
            System.out.println("Exception has been caught");
        }
        System.out.println("Program is still running");
    }
    public static void method1()throws IOException {
        int a = 100;
        int b = 0;
        System.out.println(a / b);
        File f = new File("input.txt");
        f.createNewFile();
    }
}
