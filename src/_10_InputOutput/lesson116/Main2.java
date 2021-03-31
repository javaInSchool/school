package _10_InputOutput.lesson116;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main2 {
    public static void main(String[] args) {
        String pathToDir = "D:\\Games";
        Path p = Paths.get(pathToDir);
        try{
            Files.walkFileTree(p, new MyFileVisitor());
        }catch (IOException ioe){
            System.out.println("io exception processing" + ioe);
        }
    }
}
class MyFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path p, BasicFileAttributes attrs) throws IOException{
        System.out.println("file name: " + p.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path p, BasicFileAttributes attrs){
        System.out.println("Directory name: " + p);
        return FileVisitResult.CONTINUE;
    }
}