package _4_array.lesson25;

public class Example1 {
    public static void main(String[] args) {
        //обробка масива
        int[] n = {23, 5, 8, 7, 1};
        for (int i = 0, a = n.length; i < a; i++) {
            System.out.println(n[i]);
        }
        //задача - знайти суму чисел масиву
        int sum = 0;
        for (int i = 0, a = n.length; i < a; i++) {
            sum = sum + n[i];
        }
        System.out.println("Сума чисел: " + sum);
    }
}
