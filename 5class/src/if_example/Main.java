package if_example;

public class Main {
    public static void main(String[] args) {
        /*
        Дано 3 числа: a, b, c. Вывести на экран слово
        "ДА", если a*b = c и слово "НЕТ" в другом случае.
         */
        int a = 3; // числа каждый задает свои
        int b = 2;
        int c = 6;
        if (a*b > c){
            System.out.println("ДА");
        }else {
            System.out.println("НЕТ");
        }
    }
}
