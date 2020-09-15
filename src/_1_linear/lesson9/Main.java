package _1_linear.lesson9;
public class Main {
    public static void main(String[] args) {
        byte x = 110; // 110+50 = 160 = 127 + 33
        x = (byte)(x + 50);
        System.out.println(x); //byte = -128 to 127, 255 = 1111 1111
        x += 167; // without casting

        short c = 32767; //16-bit 0111 1111 1111 1111
        c = (short)(c+1);
        System.out.println(c); // short = -32768 to 32767

        //-5 + -6 = -11
        //  10000101 //-5
        //  10000110 //-6
        //1 00001011 = 11
        //  01111010 //invertion -5
        // +
        //  01111001 //inv -6
        // =
        //  11110011 // summa
        //  01110100 // +1
        //  10001011 //-11

        byte x1 = 4;
        byte y = 7;
        //byte z = x1+y; //error without casting

        //float r = 7.1; //error without casting

        int f = 128;
        byte z = (byte)f;
        System.out.println(z);

    }
}
