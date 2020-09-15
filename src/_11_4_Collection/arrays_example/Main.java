import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = 4;
        boolean[] test1 = new boolean[size];
        int[] test2 = new int[size];
        String[] test3 = new String[size];
        Arrays.fill(test1, true); // присваивем всем true
        for (boolean temp:test1
             ) {
            System.out.println(temp);
        }

    }
}
