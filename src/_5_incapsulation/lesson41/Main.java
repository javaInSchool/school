package _5_incapsulation.lesson41;

public class Main {
    int x, z;
    static int y;
    public static void main(String[] args) {
        //System.out.println(z); //compile error, z - not static, class instance needed
        int x = 7;
        for (int i = 0; i < 5; i++) {

        }
        int i = 5;
        Main m = new Main();
        m.x = 5;
        Main.y = 7;
        m.changeX();
    }
    void changeX(){
        int x = 0;
        System.out.println(x);
        x = 999;
        System.out.println(x);
    }

}
