package practice3;

public class Main {
    public static void main(String[] args) {
        int[] x= {3, 2, 7, -5, 9, -3, -8 , 1};
        int[] y= {5, 1, 0, -10, 7};
        int[] result = new int [x.length+y.length];

        for (int i=0; i < x.length; i++){
            result[i] = x[i];
        }
        for (int i = 0; i < y.length; i++){
            result[i + x.length] = y[i];
        }
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
