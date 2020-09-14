import java.io.File;
import java.io.IOException;

public class Dispatcher {
    public static void main(String[] args) {
    }
}

class Parent{
    void create(File f) {
        try {
            f.createNewFile();
        }catch (IOException e){}
    }
}
class Child extends Parent{
    void create(File f) {//throws IOException { //compile error
        super.create(f);
        System.out.println(f.length());
    }
}

