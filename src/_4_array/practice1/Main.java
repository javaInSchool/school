package _4_array.practice1;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 9, -6, 7, 1, 0, -5};
        System.out.println(numbers.length);
        //System.out.println(numbers[0]);
        //System.out.println(numbers[1]);
        //System.out.println(numbers[2]);
        //...

        for (int i = 0, n = numbers.length; i<n; i++){
            System.out.println(numbers[i]);
        }

        int sum = 0;
        //sum = sum + numbers[0];
        //sum = sum + numbers[1];
        //sum = sum + numbers[2];
        //...
        for (int i = 0, n = numbers.length; i<n; i++){
            sum = sum + numbers[i];
        }
        System.out.println("Sum = " + sum);

        double average = sum / numbers.length;
        System.out.println(average);

    }
}
