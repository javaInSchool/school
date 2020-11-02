package _1_linear.task1;

public class Main {
    public static void main(String[] args) {
        //В магазині купили x олівців, y ручок, z маркерів.
        //Вартість олівців a, вартість ручок b, вартіть маркерів с.
        //Знайти загальну вартість канцелярських товарів
        //sum = x*a + y*b + z*c
        int x = 4;
        int y = 3;
        int z = 6;
        double a = 5.4;
        double b = 3.5;
        double c = 7.9;
        double sum = 0.0;
        sum = x*a + y*b + z*c;
        System.out.println("Загальна вартість: " + sum + " гривень");
    }

}
