package java9.oop;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("D:/myFile.txt");
        f.createNewFile();

        Swallow s = new Swallow();
        double dW = s.eat(4,"Fly");
        System.out.println(dW);
        System.out.println( s.eat(4,"Fly") );
    }
}
