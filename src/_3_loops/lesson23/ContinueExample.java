package _3_loops.lesson23;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            if(i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }
    }
}