package readFile;
import java.io.*;
import javax.swing.*;
class Main{
    public static void main(String args[]) throws IOException{
        String fileName, name, s;
        fileName=JOptionPane.showInputDialog("Вкажіть ім'я файлу:");
        FileInputStream fin = null;
        try{
            fin=new FileInputStream("src/readFile/" + fileName);
            BufferedReader br=new BufferedReader(new InputStreamReader(fin));
            name=JOptionPane.showInputDialog("Вкажіть прізвище співробітника:");
            while(true){
                s=br.readLine();
                try{
                    if(s.equalsIgnoreCase(name)){
                        System.out.println("Прізвище : "+name);
                        System.out.println("Ім'я : "+br.readLine());
                        System.out.println("По-батькові: "+br.readLine());
                        System.out.println("Вік : "+br.readLine());
                        System.out.println("Тел. : "+br.readLine());
                        break;
                    }
                }catch(NullPointerException e){
                    System.out.println("Такого співробітника немає!");
                    break;
                }
            }
            fin.close();
        }catch(FileNotFoundException e){
            System.out.println("Помилка доступу до файлу: "+e);
        }
        System.exit(0);
    }
}
