package _10_InputOutput.lesson116;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        DirectoryStream<Path> stream = null;
        String pathToDir = "D:\\";
        try{
            Path p = Paths.get(pathToDir);
            stream = Files.newDirectoryStream(p, "*.{txt,mp3}" );
            for (Path temp: stream) {
                System.out.println(temp.getFileName());
            }
        }catch (IOException ioe){
            System.out.println("io exception processing");
        }finally {
            stream.close();
        }
    }
}
