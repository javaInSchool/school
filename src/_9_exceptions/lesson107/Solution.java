package _9_exceptions.lesson107;


import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Solution {
    public static void main(String[] args){
        try {
            method1();
        }catch(NullPointerException npe){
            System.out.println("NullPointerException Caught");
        }catch (FileNotFoundException fnfe){
            System.out.println("FileNotFound Caught");
        }
    }
    public static void method1() throws FileNotFoundException,
            NullPointerException, ArithmeticException{
        int i = (int)(Math.random()*4);
        if (i == 0) throw new FileNotFoundException();
        if (i == 1) throw new NullPointerException();
        if (i == 2) throw new ArithmeticException();
        if (i == 3) {
            try {
                throw new URISyntaxException("fghf", "fg");
            }catch (URISyntaxException urie){

            }
        }
    }
}
