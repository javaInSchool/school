import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("");
        Scanner s = new Scanner(System.in);

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(input);
        //System.out.println(br.readLine());

        //String s1 = JOptionPane.showInputDialog("Hello!");
        //System.out.println(s1);
//        File f = new File("src/byteStream/input.txt");
//        try {
//            f.createNewFile();
//        }catch(IOException e){
//            System.out.println(e.toString());
//        }
        FileInputStream infile = null;
        FileOutputStream outfile = null;
        try{
            infile = new FileInputStream("src/byteStream/input.txt");
            //outfile = new FileOutputStream("src/byteStream/input.txt");
        }catch(FileNotFoundException e){
            System.out.println("Error" + e.toString());
        }
        //outfile.write(0b01000001);
        System.out.println(infile.read());
        System.out.println(infile.read());

    }
}
