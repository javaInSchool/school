package exception4;
import java.io.*;
public class Dispatcher {
    public static void main(String[] args) {
        File f1 = new File("src/exception4/file1");
        System.out.println(f1.length());

        File f2 = new File("src/exception4/file2");
        create(f2);

        File f3 = new File("src/exception4/file3");
        try {
            createFile(f3);
        }catch(IOException ioe){}

        int x = 10; int y = 0;
        int[] z = {1,2,3};
        divide(x,y);
        try {
            display(z);
        }catch (ArrayIndexOutOfBoundsException e){}
    }
    static void create(File f){
        try{
            f.createNewFile();
        }catch(IOException e){}
    }
    static void createFile(File f) throws IOException{
        f.createNewFile();
    }

    static void divide(int a, int b){
        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){}
    }
    static void display(int[] q) throws IndexOutOfBoundsException{
        System.out.println(q[3]);
    }
}






