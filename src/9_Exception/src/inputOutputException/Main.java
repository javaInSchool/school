package inputOutputException;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args)throws ArithmeticException{
        File f1 = new File("src/inputOutputException/f1");
        try{
            f1.createNewFile();
        }catch (IOException e){
            System.out.println("Could not create file");
        }
        System.out.println(f1.length());

        //try {
            //create(f1);
        //}catch (IOException e){
        //    System.out.println("Could not create file");
        //}
        int[] z = {1,2,3};
        try {
            display(z);
            calc();
        }catch (Exception e){
            System.out.println(e);
        }
        create(f1);


    }
    static void create(File f) {
        try{
            f.createNewFile();
        }catch(IOException e){}
    }
    static void calc() throws ArithmeticException{
        int x = 9;
        int y = 0;
        System.out.println(x/y);
    }

    static void display(int[] q) {
        System.out.println(q[6]);
    }
}