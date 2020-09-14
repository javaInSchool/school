package initialization;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        House h = new House("yellow");
        System.out.println(h.color + " " + h.square+" " +h.door.height);
    }
}

class House{
    int square = 160;
    String color;
    Door door = new Door(210);

    House(String c){
        System.out.println("Color: " + color);
        color = c;
        System.out.println("inside House constructor...");
        System.out.println("Color: " + color);
    }
}

class Door{
    int height;
    Door(int h){
        System.out.println("Height: " + height);
        height = h;
        System.out.println("inside Door constructor...");
        System.out.println("Height: " + height);
    }

}
