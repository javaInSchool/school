package _5_incapsulation.lesson44_overload_constuctor;

public class Car {
        int price;
        String model;

        Car(int p, String t){ //constructor with 2 parameters
            price = p;
            model = t;
        }

        Car(){} //default constructor

        Car(int p){
            price = p;
        }  //constructor with 1 parameter

}
