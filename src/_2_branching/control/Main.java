package _2_branching.control;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Определить стоимость доставки посылки в зависимости от об.веса
        Scanner s = new Scanner(System.in);
        System.out.println("Введите объемный вес: ");
        double weight = s.nextDouble();
        double price = 30;
        if(weight <= 1){
            System.out.println("Стоимость доставки: " + price);
        }else if (1 < weight & weight <= 2){
            price = 35;
            System.out.println("Стоимость доставки: " + price);
        }else if (2 < weight & weight <= 5){
            price = 50;
            System.out.println("Стоимость доставки: " + price);
        }else if (5 < weight & weight <= 10){
            price = 70;
            System.out.println("Стоимость доставки: " + price);
        }else {
            price = 100 + (weight-10)*2;
            System.out.println("Стоимость доставки: " + price);
        }
    }
}
