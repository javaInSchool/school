package _8_interface_innerclass.lesson96;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Car[] myCars = {
                new Car(200,50000,"Yellow","Tesla"),
                new Car(210,30000,"Red","Mersedes"),
                new Car(250,40000,"Black","BMW")
        };

        Arrays.sort(myCars, new Car.ComparatorByColor());
        for (Car temp: myCars) {
            System.out.println(temp);
        }
        //new sorting by price
        Arrays.sort(myCars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.price-o2.price;
            }
        });
        for (Car temp: myCars) {
            System.out.println(temp);
        }
        //sorting by speed
        Arrays.sort(myCars, (Car o1, Car o2) -> {return o1.speed-o2.speed;});
    }
}
