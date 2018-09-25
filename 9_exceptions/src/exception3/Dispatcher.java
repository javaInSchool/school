package exception3;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Dispatcher {
    public static void main(String args[]) {
        int x = 0, index = 0, y = 1;
        int[] z = new int[10];

        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("Введите число 1, 2 или 3:");
            try {
                x = s.nextInt();
            }catch(InputMismatchException e) {
                System.out.println("Введены неправильные данные");
                s.next();
                continue;
            }

            if(x == 1) {
                index = 25; break;
            }else if(x == 2) {
                y = 0; break;
            }else if(x == 3) {
                break;
            } else {
                System.out.println("Введено неверное число");
            }
        }
        try {
            z[index] = 100;
            x = 10 / y;
            System.out.println("Ошибок не найдено");
            return;
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Причина ошибки:" + e);
        }finally{
            System.out.println("Завершение работы объекта s");
            s.close();
        }
    }
}