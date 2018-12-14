package staticInnerClassExample2;

import java.util.Arrays;

public class Dispatcher {
    public static void main(String[] args) {
        Car c1 = new Car(200,8000,"BMW","Red");
        Car c2 = new Car(120,1000,"Tavria","Green");
        Car c3 = new Car(190,9000,"Citroen","White");
        Car[] c = {c1,c2,c3};
        Arrays.sort(c);
        for (Car temp:c){
            System.out.println(temp);
        }
        System.out.println();
        Arrays.sort(c, new Car.ComparatorByColor());
        for (Car temp:c){
            System.out.println(temp);
        }
        System.out.println();
        Arrays.sort(c, new Car.ComparatorByPrice());
        for (Car temp:c){
            System.out.println(temp);
        }
        System.out.println();
        Arrays.sort(c, new Car.ComparatorBySpeed());
        for (Car temp:c){
            System.out.println(temp);
        }
    }
}
