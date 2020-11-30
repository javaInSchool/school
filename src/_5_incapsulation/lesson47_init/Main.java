package _5_incapsulation.lesson47_init;

public class Main {
    public static void main(String[] args) {
        House h = new House("yellow");
        System.out.println(h.color + " " + h.square+" " +h.door.height);
    }
}
