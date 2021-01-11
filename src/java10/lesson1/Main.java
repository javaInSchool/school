package java10.lesson1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        //створюємо дві змінні та надаємо значення
        int x = 5;
        int y = 3;
        //Арифметичні операції
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        //задача 1.
        //Обчислити значення виразу: чисельник - у дужках x + y помножене на ,у дужках, x - z, знаменник 2x+3z
        int z = -1;
        double result = (x+y)*(x-z)/(2*x+3*z);
        System.out.println(result);

    }
}

