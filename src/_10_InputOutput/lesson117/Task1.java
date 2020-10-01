package _10_InputOutput.lesson117;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        //Java N-IDE - android
        //String data = "java \n forever"; // \n - enter key, new line
        File f = new File("src/_10_InputOutput/lesson117/input.txt");
        FileInputStream fis = null;
        int c = 0;
        int counter = 0;
        try {
            fis = new FileInputStream(f);
            while( (c = fis.read()) != -1 ) { //-1 - file end
                //c = fis.read();
                System.out.println((char) c);
                if(c == 'k'){
                    counter++;
                }
            }
        }catch(IOException e){
            System.out.println("File not found");
        }finally {
            try {fis.close();} catch(IOException e){}
        }
        System.out.println("Number of 'k' : " + counter);
    }
}
