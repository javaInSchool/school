package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] x = {3, 2, 8, -3, 1, 4, 5, 4};
        String[] s = {"Mary", "Serg", "Taras", "Kate"};

        Arrays.sort(x);
        Arrays.sort(s);

        for (int temp : x){
            System.out.print(temp + " ");
        }
        System.out.println();
        for (String temp : s){
            System.out.print(temp + " ");
        }

        Car c1 = new Car (200, 14000, "BMW", "Black");
        Car c2 = new Car (140, 7000, "Tavria", "Green");
        Car c3 = new Car (190, 4000, "Citroen", "White");
        Car c4 = new Car (140, 2000,"Zaporogets", "Red");
        Car[] c = {c1,c2,c3,c4};
        Arrays.sort(c);
        for (Car temp: c){
            System.out.println(temp.toString());
        }

        Arrays.sort (c, new ComparatorByPrice());
        for (Car temp: c){
            System.out.println(temp.toString());
        }
    }
}
class Car implements Comparable{
    int speed;
    int price;
    String model;
    String color;
    Car(int speed, int price, String model, String color){
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }
    public String toString(){
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    @Override
    public int compareTo(Object o) { //from interface Comparable
//        int temp = this.speed - ((Car)o).speed;
//        if (temp == 0) {
//            return this.price - ((Car)o).price;
//        } else {
//            return temp;
//        }
        return this.model.compareTo(   (  (Car)o  ).model   );
    }
}

class ComparatorByPrice implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Car)o1).price - ((Car)o2).price;
    }
}
