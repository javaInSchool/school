package lesson_9;
public class Main {
    public static void main(String[] args) {
        byte b = 127;
        b++;
        System.out.println(b);

        byte x = 4;
        byte y = 7;
        byte z = (byte)(x+y); //error

        float r = (float)7.1; //error

        int f = 128;
        z = (byte)f;
        System.out.println(z);

    }
}
