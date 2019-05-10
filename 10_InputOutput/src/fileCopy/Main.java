package fileCopy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path fileFrom = Paths.get("src/fileAttributes/temp.txt");
        Path fileTo = Paths.get("src/fileCopy/tempCopy.txt");
        Files.copy(fileFrom,fileTo);
    }
}
