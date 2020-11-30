package _5_incapsulation.lesson47_init;

public class House{
    int square; // init defaulf 0
    String color; // init defaulf null
    Door door = new Door(210);

    House(String c){
        System.out.println("Color: " + color);
        color = c;
        System.out.println("inside House constructor...");
        System.out.println("Color: " + color);
    }
}