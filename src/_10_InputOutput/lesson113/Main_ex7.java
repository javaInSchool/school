package _10_InputOutput.lesson113;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main_ex7 {
    public static void main(String[] args) {
        Path path = Paths.get("src\\_10_InputOutput\\lesson113\\input.txt");
        try{
            Object object = Files.getAttribute(path,"creationTime");
            System.out.println("Creation time: " + object);

            //здесь указан третий параметр
            object = Files.getAttribute(path,"lastModifiedTime",
                    LinkOption.NOFOLLOW_LINKS);
            System.out.println("Last modified time: " + object);

            object = Files.getAttribute(path,"size");
            System.out.println("Size: " + object);

            object = Files.getAttribute(path, "isDirectory");
            System.out.println("isDirectory: " + object);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
