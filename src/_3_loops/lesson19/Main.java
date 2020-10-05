package _3_loops.lesson19;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++){
            System.out.println("Number: " + i);
        }
        for (int i = 4; i > 0 ; i--){
            System.out.println("Number: " + i);
        }
        // int i = 4;
        // 4 > 0 - true
        // sout 4
        // i--  i=3
        // 3 > 0 - true
        // sout 3
        // i-- i=2
        // ...
        // i-- i=0
        // 0 > 0 - false
    }
}
