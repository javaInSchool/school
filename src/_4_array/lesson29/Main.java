package _4_array.lesson29;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 9, 4, -4, 0, 2, -7};
        for (int i = 0, n = numbers.length; i < n; i++) {
            numbers[i] = (int)(Math.random()*100); // 0.0 - 1.0
        }
        for (int temp: numbers) {
            System.out.print(" "+temp);
        }
        int count = 0, sum = 0;
        for (int i = 0, n = numbers.length; i < n; i++) {
            if(i % 2 == 0 & (20 <= numbers[i] & numbers[i] <=30)){
                count++;
                sum = sum + numbers[i];
            }
        }
        System.out.println("Кол-во: " + count + "Сумма: " + sum);
    }
}
