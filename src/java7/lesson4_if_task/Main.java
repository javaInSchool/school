package java7.lesson4_if_task;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Сторона а: ");
        int a = input.nextInt();
        System.out.println("Сторона b: ");
        int b = input.nextInt();
        System.out.println("Сторона c: ");
        int c = input.nextInt();

        if( a+b>c && b+c>a && a+c>b ){
            System.out.println("Трикутник існує");
            if ( a != b && a != c && b != c){
                System.out.println("Трикутник різносторонній");
            }
            if ( a == b && a == c && b == c){
                System.out.println("Трикутник рівносторонній");
            }else if ( a == b || a == c || b == c ){
                System.out.println("Трикутник рівнобедренний");
            }
        }else{
            System.out.println("Трикутник не існує");
        }

    }
}
