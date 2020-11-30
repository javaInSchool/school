package _5_incapsulation.lesson47_init;

public class Door{
    {
        System.out.println("block of init");
    }
    int height;
    Door(int h){
        System.out.println("Height: " + height);
        height = h;
        System.out.println("inside Door constructor...");
        System.out.println("Height: " + height);
    }


}
