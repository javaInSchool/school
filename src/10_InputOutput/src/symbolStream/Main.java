import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        FileReader inputStream = null;
        FileWriter outputStream = null;
        try {
            inputStream = new FileReader("d:\\input.txt");
            outputStream = new FileWriter("d:\\output.txt");
            br = new BufferedReader(inputStream);
            String temp = null;
            int count = 1;
            while ((temp = br.readLine()) != null) {
                //System.out.println("While begin");
                if(count == 1 || count == 3 || count == 5){
                    count++;
                    continue;
                }
                System.out.println(temp + " " + count);
                count++;

            }
        }catch (IOException e){
            System.out.println("Error" + e);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
