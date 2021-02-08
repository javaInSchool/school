package _8_interface_innerclass.lesson90_compare;

import java.util.Comparator;

public class Car implements Comparable{
    int speed;
    String model;
    String color;
    double price;

    public Car(int speed, String model, String color, double price) {
        this.speed = speed;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int result = 0;
        if(this.speed > ( (Car)o ).speed) {
            result = 1;
        }else if(this.speed < ( (Car)o ).speed){
            result = -1;
        }else{
            result = 0; //сюда можно дописать сортировку по 2 и 3, и т.д. полю
        }
        //this.speed - ( (Car)o ).speed
        return result;
    }
}

class SortByModel implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return ((Car)o1).model.compareTo(((Car)o2).model) ;
    }
}
