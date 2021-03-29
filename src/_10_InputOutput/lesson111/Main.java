package _10_InputOutput.lesson111;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Output");
        //char x = (char)System.in.read();
        //System.out.println(x);

        /* example 2
        char x;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do{
            x = (char)br.read();
            System.out.println(x);
        }while(x!='q');

         */

        /* example 3
        String str="Ваше замовлення: ";
        String data;
        int count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Що бажаєте:");
        data=br.readLine();
        while(!data.equalsIgnoreCase("Ні")){
            count++;
            str=str+"\n"+count+": "+data.toLowerCase();
            System.out.println(str+"\n Ще щось?");
            data=br.readLine();
        }
        System.out.println("Дякуємо! Ваше замовлення прийнято!");
        */

        /* example 4 Input Frame


        String name;
        int age;
        System.out.println("What is your name");
        name = JOptionPane.showInputDialog("Set your name");
        System.out.println("Your name is " + name + "!");
        System.out.println("How old are your?");
        age = Integer.parseInt(JOptionPane.showInputDialog("Set your age"));
        System.out.println("Your age is " + age + "!");
        */

        /*
        example 5
         */

        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream(
                    "src/_10_InputOutput/lesson111/input.txt");
            out = new FileOutputStream(
                    "src/_10_InputOutput/lesson111/output.txt");
            int c;
            while( (c = in.read() ) != -1 ){
                out.write(c);
                System.out.print(c+" "); // 1010 1010 - 127,   //4b = 32bit - 1010 1010 1010 1010 1010 1010 1010 1010
            }
        }finally {
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }

    }
}
