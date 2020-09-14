import java.io.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        RandomClass rc1 = new RandomClass();
        RandomClass rc2 = new RandomClass();
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("src/serializable/data.dat"));
        Date now = new Date(System.currentTimeMillis());
        out.writeObject(now);
        out.writeObject(rc1);
        out.writeObject(rc2);
        out.close();
        System.out.println("I have written a Date object " + now);
        System.out.println("I have written 2 objects");
        rc1.printOut();
        rc2.printOut();

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("src/serializable/data.dat"));
        try {
            Date now2 = (Date) in.readObject();
            System.out.println("I have read:");
            System.out.println("A Date object: "+now2);

            RandomClass rc3 = (RandomClass) in.readObject();
            RandomClass rc4 = (RandomClass) in.readObject();
            System.out.println("Two Group of randoms");
            rc3.printOut();
            rc4.printOut();
        }catch (ClassNotFoundException e){
            System.out.println("Class not found");
        }
    }
}

class RandomClass implements Serializable{
    private static int r(){
        return (int)(Math.random()*10);
    }
    private int datafile[];
    public RandomClass(){
        datafile = new int[r()];
        for (int i = 0, n = datafile.length; i < n; i++) {
            datafile[i] = r();
        }
    }
    public void printOut(){
        System.out.println("This RandomClass has "
                +datafile.length+" random integers");
        for (int i = 0, n = datafile.length; i < n; i++) {
            System.out.println(datafile[i] + ":");
        }
    }
}