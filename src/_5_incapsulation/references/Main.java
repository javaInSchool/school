package references;

public class Main {
    public static void main(String[] args) {
        int x = 7;
        Car c = new Car();
        c.color = "white";
        c.price = 1000;
        change(c);
        System.out.println(c.color + " " + c.price);
    }
    static void change(Car c){
        c.color = "Red";
        c.price = 2000;
        System.out.println(c.color + " " + c.price);
    }

}
