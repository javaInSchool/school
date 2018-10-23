package example1;

public class Main {
    public static void main(String[] args) {
        int x = 8;
        int y2 = 9;
        int z3 = 10;
        int o4 = -5;
        int[] box;
        int [] box2;
        int []box3;

        int[] box4 = new int[6];
        double[] box5 = new double[1000];

        System.out.println(box4[2]);
        System.out.println(box5[999]);

        box4[2] = 10;
        System.out.println(box4[2]);

        int[] box6 = {1,-9,6,7};
        System.out.println(box6[1]);

        String[] names = {"Danil","Mariya","Ivan"};
        System.out.println(names[2]);

        System.out.println(names[99]);
    }
}
