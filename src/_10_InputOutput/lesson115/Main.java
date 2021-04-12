package _10_InputOutput.lesson115;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathToDir = "D:\\Python_12.pdf";
        Path p = Paths.get(pathToDir);

        BasicFileAttributes attrs = Files.readAttributes(p, BasicFileAttributes.class);
        System.out.println(attrs.creationTime());
        System.out.println(attrs.isDirectory());
        
        File f1 = new File("D:\\Python_12.pdf");
        String pathTest = f1.getAbsolutePath();
        System.out.println(pathTest);
        p = Paths.get(pathTest);
        DosFileAttributes attrs2 = Files.readAttributes(p, DosFileAttributes.class);
        System.out.println(attrs2.isHidden());
    }
}
