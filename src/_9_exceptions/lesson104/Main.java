package exception.lesson104;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        //System.out.println(x / y);  //unchecked exception

        File f = new File("src/exception/lesson104/input.txt");
        try {
            f.createNewFile();     //checked exception
        }catch(IOException ioe){
            System.out.println("Not enough disk space!");
        }
        //try {  //process exception
            divide(x, y);
        //}catch(ArithmeticException ae){
        //    System.out.println("Divide by 0");
        //}
    }
    static void createFile(File file){
        //file.createNewFile();
    }

    static void divide (int a, int b) {
        try{
            System.out.println(a / b);
        }catch(ArithmeticException ae){
            System.out.println("Divide by 0");
            throw ae;
        }
    }

}
