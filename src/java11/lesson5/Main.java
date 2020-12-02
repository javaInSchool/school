package java11.lesson5;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        while (n < 20){
            if (n % 2 == 0){
                System.out.println(n);
            }
            n++;
        }
        // 0 < 20 - true
        // 0 % 2 == 0 - true
        // sout - 0
        // n++  ->  n = 1

        // 1 < 20 - true
        // 1 % 2 == 0 - false
        // ничего не выведет
        // n++  ->  n = 2

        // 2 < 20 - true
        // 2 % 2 == 0 - true
        // sout - 2
        // n++  ->  n = 3
    }
}
