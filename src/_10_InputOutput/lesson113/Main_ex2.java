package _10_InputOutput.lesson113;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main_ex2 {
    public static void main(String[] args) throws IOException {
        //Пример строки пути для запуска в Windows
        Path testFilePath = Paths.get(".\\Test");

        System.out.println("The file name is: " + testFilePath.getFileName());
        System.out.println("It's URI is: " + testFilePath.toUri());
        System.out.println("It's absolute path is: " + testFilePath.toAbsolutePath());
        System.out.println("It's normalized path is: " + testFilePath.normalize());
        //Получение другого объекта строки по нормализованному относительному пути
        Path testPathNormalized = Paths.get(testFilePath.normalize().toString());
        System.out.println("It's normalized absolute path is: " + testPathNormalized.toAbsolutePath());
        System.out.println("It's normalized real path is: "
                + testFilePath.toRealPath(LinkOption.NOFOLLOW_LINKS));
    }
}
