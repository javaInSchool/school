package example4;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,9,4,-5, 6, -2, -12, 4, 9};
        for(int i = 0, n = numbers.length; i<n; i++) {
            if (numbers[i] < 0) {
                numbers[i] = -numbers[i];
            }
        }
        for (int temp:numbers) {
            System.out.println(temp);
        }

    }
}
