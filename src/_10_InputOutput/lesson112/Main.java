package _10_InputOutput.lesson112;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            in = new BufferedReader(new FileReader(
                    "src/_10_InputOutput/lesson111/input.txt"));
            out = new PrintWriter(new FileWriter(
                    "src/_10_InputOutput/lesson111/output.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                out.println(line);
            }
        }catch(IOException e){
            System.out.println("File not found, not enoght disk space");
        }finally {
            if (in != null){
                try {
                    in.close();
                }catch (IOException e){
                    System.out.println("Can't close stream");
                }
            }
            if (out != null){
                out.flush();
                out.close();
            }
        }
    }
}
