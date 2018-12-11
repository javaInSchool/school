package example_sum;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7,9,-3,0, 1, -4};
        System.out.println(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
