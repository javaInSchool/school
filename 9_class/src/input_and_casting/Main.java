package input_and_casting;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Вкажіть вартіть олівця: ");
        int x = input.nextInt();

        System.out.print("Вкажіть кількість олівців: ");
        int y = input.nextInt();

        System.out.println("Вартість " + y +
                " олівців = " + x*y +" гривень");

        double z = 5.4;
        z = input.nextDouble();
        int d = (int)input.nextLong();
        System.out.println(d);

        long r = 100;
        r = d;
        int t = 100;
        //byte b = t;
    }
}