package array;

public class Main {
    public static void main(String[] args) {
        int x = 6;
        int[] array = {-5,8,3,9,0,-455};
        System.out.println(array[1]);
        System.out.println(array.length);

        for (int i = 0, n = array.length; i < n; i++) {
            System.out.print(array[i]+ " ");
        }

        double[] y = new double[10];
        System.out.println(y[5]);

        String[] names = new String[4];
        names[0] = "Maksum";
        names[1] = "Serg";
        names[2] = "Katy";
        names[3] = "Bogena";
        //System.out.println(names[7]);

        int[] array1 = {5,9,-3,0};
        int[] array2 = new int[array1.length];

        for (int i = 0, n = array1.length; i < n; i++) {
            array2[i]=array1[i] + 1;
        }
        for (int i = 0, n = array2.length; i < n; i++) {
            System.out.print(array2[i] + " ");
        }

    }
}
