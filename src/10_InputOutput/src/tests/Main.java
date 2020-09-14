import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("src/tests/test.txt");
        String s = "тесты";
        for (int i = 0, n = s.length(); i < n; ++i) {
            out.write(s.charAt(i));
        }
        out.close();
    }
}
