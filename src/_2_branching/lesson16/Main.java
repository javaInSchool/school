package _2_branching.lesson16;

public class Main {
    public static void main(String[] args) {
        // bit operation

        int x = 2; // 0000 0010
        int y = 1; // 0000 0001

        System.out.println( x & y);  // bit and operation = 0000 0000
        System.out.println( x | y);  // bit or operation =  0000 0011
        System.out.println( ~x );

        int z = 3; // 0000 0011
        System.out.println( z >> 1); // 0000 0001
        System.out.println( z << 2); // 0001 1000

    }
}
