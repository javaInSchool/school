package exception2;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

    }
}

class Parent{
    void create(File f) throws IOException {
        f.createNewFile();
    }

}
class Child extends Parent{
    @Override
    void create(File f) throws IOException{
        super.create(f);
        System.out.println(f.length());
    }

}
