package example4;

public class Main {
    public static void main(String[] args) {
        int x = 6; //  0000 0110
        int y = 2; //  0000 0010
        int result = 0;
        result = x & y;
        System.out.println(result); //  0000 0010 = 2
        result = x | y;
        System.out.println(result); //  0000 0110 = 6
        result = x ^ y;
        System.out.println(result); //  0000 0100 = 4
        result = x << 1;
        System.out.println(result); //  0000 1100 = 12
        result = ~x;
        System.out.println(result); //  1111 1001 = -7
    }
}
