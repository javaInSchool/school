package _4_array.lesson25;

public class Main {
    public static void main(String[] args) {
        String name = "Oleg";
        String name1 = "Mariaya";
        String[] names = {"Oleg", "Andrey", "Nina"};
        int[] numbers = new int[5];
        numbers[0] = -5;
        numbers[1] = 2;
        System.out.println(numbers[1] + numbers[4]);

        double[] d;

        //System.out.println(numbers[10]); //exception
        System.out.println(numbers.length);
    }
}
