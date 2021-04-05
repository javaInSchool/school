package _10_InputOutput.lesson118;

import java.io.*;

public class Main  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        RandomClass rc = new RandomClass();
        for (int temp: rc.datafile) {
            System.out.print(temp+" ");
        }
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("src\\_10_InputOutput\\lesson118\\data.dat"));
        out.writeObject(rc);
        out.flush();
        out.close();

        RandomClass rc2 = null;
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("src\\_10_InputOutput\\lesson118\\data.dat"));
        rc2 = (RandomClass) in.readObject();
        for (int temp: rc2.datafile) {
            System.out.print(temp+" ");
        }
    }
}
class RandomClass implements Serializable{
    int[] datafile;
    public RandomClass() {
        datafile = new int[(int)(Math.random()*10+1)];
        for (int i = 0, n = datafile.length; i < n; i++) {
            datafile[i] = (int)(Math.random()*10);
        }
    }
}
