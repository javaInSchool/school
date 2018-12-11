package example5;

public class Main {
    public static void main(String[] args) {
        int[] x = {4, -8, 4, 0};
        int[] y = {-2, 12, 7, -8, 3, 2};

        int[] z = new int[x.length+y.length];
        for (int i = 0, n = x.length; i < n; i++) {
            z[i] = x[i];
        }
        for (int i = x.length, n = z.length; i < n; i++) {
            z[i] = y[i-x.length];
        }

        for (int temp:z) {
            System.out.print(temp+" ");
        }


    }
}
