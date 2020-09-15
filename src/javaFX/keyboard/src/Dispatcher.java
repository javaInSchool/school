package javaFX.keyboard.src;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dispatcher {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new File("D:\\keyboard.in"));
            String data = s.nextLine(); //read first number
            String result = s.nextLine(); //read second number
            int count = 0;
            String saved = result;
            while(result.length()>0){
                System.out.println(data + " search ... " + result);
                if(data.indexOf(result)!=-1){
                    int index = data.indexOf(result);
                    System.out.print("data contain: " + result);
                    count++;
                    data = data.substring(index+result.length(),data.length());
                    saved = saved.substring(result.length(),saved.length());
                    result = saved;
                    System.out.println("... result refreshed on..."+result);
                    if(result.equals("")){count++;}
                }else{
                    result = result.substring(0,result.length()-1);
                    System.out.println("missed... last char deleted...");
                }
            }
            System.out.println(count);
            //javaforevernever
            s.close(); //close scanner object
            FileWriter fr = new FileWriter(new File("D:\\output.txt"));
            fr.append("" + count); //add results to output file
            fr.flush(); //empty buffer
            fr.close(); //close FileWriter and finish write to file
        } catch (IOException e){}
    }
}
