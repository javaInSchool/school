package _10_InputOutput.lesson113;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("src/_10_InputOutput/lesson113/input.txt");
        System.out.println(p.getFileName());
        System.out.println(p.getRoot());
        System.out.println(p.getParent());
        p = Paths.get("src/_10_InputOutput/lesson113");
        for (Path temp:p) {
            System.out.println(temp);
        }
        System.out.println(p.toAbsolutePath());
        File f = new File("src/_10_InputOutput/lesson113/output.txt");
        f.createNewFile();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(f.toString());
        Path pathSource = Paths.get(f.toString());
        //Path pathSource = Paths.get("C:/Windows/setuperr.log");
        Files.delete(pathSource);

    }
}
