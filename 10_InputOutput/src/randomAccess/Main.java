package randomAccess;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    static final String FILENAME = "d:\\input.txt";
    public static void main(String[] args) {
        try {
            System.out.println(new String(readFromFile(FILENAME, 72, 34)));
            writeToFile(FILENAME, "JavaCodeGeeks Rocks!", 22);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static byte[] readFromFile(String filePath, int position, int size)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    private static void writeToFile(String filePath, String data, int position)
            throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}
