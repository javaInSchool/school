import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args) {
        File f = new File("src/fileAttributes/temp.txt");
        try {
            f.createNewFile();
        }catch (IOException e){
            System.out.println("Cound not create file");
        }

        Path file = Paths.get("src/fileAttributes/temp.txt");
        try {
            BasicFileAttributes attrs = Files.readAttributes(file, BasicFileAttributes.class);
            System.out.println(attrs.size());
        }catch (IOException e){
            System.out.println("Error");
        }
        displayAttribute(f);
    }

    public static void displayAttribute (File myFile){
        System.out.println("canExecute:" + myFile.canExecute());
        System.out.println("Absolute Path:" + myFile.getAbsolutePath());
        System.out.println("is Dir:" + myFile.isDirectory());
    }
}