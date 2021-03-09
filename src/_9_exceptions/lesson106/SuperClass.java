package _9_exceptions.lesson106;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SuperClass {
    void createMyFile(File f) throws IOException {
        f.createNewFile(); //checked exception
    }
}

class SubClass extends SuperClass{
    @Override
    void createMyFile(File f) throws IOException, FileNotFoundException {
        super.createMyFile(f);
        System.out.println(f.getPath());
    }
}
