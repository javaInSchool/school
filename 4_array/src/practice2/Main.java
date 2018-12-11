package practice2;

public class Main {
    public static void main(String[] args) {
        int[] x = {-4, 0, 4, 2, 12};
        int[] y = {3, 8, -1, 14, -3};
        int[] result = new int[x.length];

        for(int i = 0, n=result.length; i<n; i++) {
            result[i] = x[i] + y[i];
        }
        for(int i = 0, n=result.length; i<n; i++) {
            System.out.print(result[i] + " ");
        }


    }
}
