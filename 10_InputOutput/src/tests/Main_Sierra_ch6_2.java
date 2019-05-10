package tests;

import java.io.*;

public class Main_Sierra_ch6_2 extends Player{ //implements Serializable for original test
    public static void main(String[] args) {
        Main_Sierra_ch6_2 m = new Main_Sierra_ch6_2();
        try{
            FileOutputStream fos = new FileOutputStream("src/tests/test.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(m);
            os.flush();
            os.close();
            FileInputStream fis = new FileInputStream("src/tests/test.txt");
            ObjectInputStream is = new ObjectInputStream(fis);
            Main_Sierra_ch6_2 m2 = (Main_Sierra_ch6_2)is.readObject();
            is.close();
        }catch (Exception e){}
    }
    Main_Sierra_ch6_2(){
        System.out.println("c");
    }
}

class Player implements Serializable{ // alternative
    Player(){
        System.out.println("p");
    }
}
