package serializable2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) throws IOException {
        MyClass mc = new MyClass(4, "Oleg", new Thread());
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("src/serializable2/data.dat")
        );
        out.writeObject(mc);
    }
}

class MyClass implements Serializable{
    private int id;
    private String name;
    public transient Thread myThread; //transient - пропускает несериализуемое поле
    public MyClass(int id, String name, Thread myThread){
        this.id = id;
        this.name = name;
        this.myThread = myThread;
    }
}