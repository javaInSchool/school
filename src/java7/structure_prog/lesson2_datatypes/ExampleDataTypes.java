package java7.structure_prog.lesson2_datatypes;

public class ExampleDataTypes {
    public static void main(String[] args) {
        // 1 byte = 8 bit
        // 2 byte = 16 bit
        // 3 byte = 24 bit

        // 1 byte = 0111 1111  , 1 - 5V, 0 - 0V

        byte x = 127;  //8 bit   -128 x 127 = 7bit = 2^7 - 1
        System.out.println(x);

        short y = 32767;  //16 bit   -32768 x 32767 = 15bit = 2^15 - 1
        System.out.println(y);

        int z = 2_147_483_647;  //32bit
        System.out.println(z);

        long a;
        a = 4534534534534535L; //64bit
        System.out.println(a);

        char c = 'A';  //0100 0001 = 65
        System.out.println((int) c);  //casting

        String data = "5";
        //System.out.println( (int) data);  //casting error

        float f = 4.5f;  //32bit
        double d = 8.7; //64bit

        f = z;  // auto casting int -> float
        f = x;  // auto casting byte -> float

        byte x2; //8bit
        x2 = (byte) 250; //127
        System.out.println(x2);  // 44  = 127 (0111 1111 + 1 = 1000 0000) + 128 + 1 + 44
        //0 127, -128 ... 127, -128 ...

        int n = (int) d;
        System.out.println(n);
    }
}