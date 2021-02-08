package _8_interface_innerclass.lesson90_compare;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x = {1, 8, 4, 12, -2, -8, -3, 7};
        Arrays.sort(x);
        for (int temp: x) {
            System.out.print(temp + " ");
        }
        Car[] cars = {
                new Car(190,"BMW","red", 5.665),
                new Car(200,"Mersedes","black", 9.705),
                new Car(190,"Fiat","blue", 7.124),
                new Car(160,"ChinaCar","green", 3.777)
        };
        //interface Comparable - compareTo()
        Arrays.sort(cars);
        for (Car temp: cars) {
            System.out.println(temp);
        }

        System.out.println();
        //interface Comparator - compare()
        Arrays.sort(cars, new SortByModel());
        for (Car temp: cars) {
            System.out.println(temp);
        }
    }
}
