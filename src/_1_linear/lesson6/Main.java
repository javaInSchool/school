package _1_linear.lesson6;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 9;
        int z = x + y;
        System.out.println("x = " + x);
        String name = "Oleh";
        String surname = "Horbach";
        String fio = name + " " + surname;
        System.out.println(fio);

        System.out.println(x+y);
        System.out.println(x + " " + y);
        System.out.println(x + y + " " + x + y);
        System.out.println(x + y + " " + (x + y) );

        int x1 = 4;
        int y1 = 5;
        x1 += 4; //x1 = x1 + 4;
        System.out.println(x1);

        System.out.println(y1/x1); // 5 / 8 = 0
        System.out.println(y1 % x1); // остаток, 5 % 8 = 5

        double z1 = x1; // double <- integer
        //x1 = z1; // compile error, integer <- double

        x1 = y1;

        int number = 725;
        int h = number / 100;       // 725 / 100 = 7
        int temp = number % 100;    // 725 % 100 = 25
        int d = temp / 10;          // (725 - 7*100) / 10 = 2
        int e = number % 10;        // 725 % 10 = 5
        System.out.println("Сотен: " + h
                + " , десятков: " + d + " , единиц:" + e);

    }
}
