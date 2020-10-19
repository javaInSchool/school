package _4_array.lesson27;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {21, 5, -5, 4, 29, 0 , 31};
        int sum = 0;
        for (int number : myArray) {
            sum = sum + number;
            number = 100;
        }
        System.out.println("Sum = " + sum);
        System.out.println(myArray[1]);
    }
}
