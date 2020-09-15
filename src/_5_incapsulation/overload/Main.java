package overload;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(4000, "BMW");
        Car yourCar = new Car();
        Car hisCar = new Car(400);
    }
}

class Car{
    int price;
    String model;

    Car(int p, String t){
        price = p;
        model = t;
    }

    Car(){
    }
    Car(int p){
        price = p;
    }

}
