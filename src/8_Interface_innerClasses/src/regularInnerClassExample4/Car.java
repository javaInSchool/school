package regularInnerClassExample4;

import java.util.Comparator;
public class Car implements Comparable{
    int speed, price;
    String model, color;
    public Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }
    public String toString(){
        return this.model+" "+this.color+" "+this.speed+" "+this.price;
    }
    public int compareTo(Object o){
        return this.model.compareTo(((Car)o).model);//main sorting
    }
    class ComparatorByPrice implements Comparator{
        public int compare(Object o1, Object o2){
            return ((Car)o1).price-((Car)o2).price;
        }
    }
    class ComparatorBySpeed implements Comparator{
        public int compare(Object o1, Object o2){
            return ((Car)o1).speed-((Car)o2).speed;
        }
    }
    class ComparatorByColor implements Comparator{
        public int compare(Object o1, Object o2){
            return ((Car)o1).color.compareTo(((Car)o2).color);
        }
    }
}