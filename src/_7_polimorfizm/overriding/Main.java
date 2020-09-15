package overriding;

public class Main {
    public static void main(String[] args) {
        Owl o = new Owl();
        o.move();
    }
}

class Bird{
    void move(){
        System.out.println("Different ways");
    }
}
class Owl extends Bird{
    @Override
    void move() {
        System.out.println("Flying...");
    }
}

class Pinguin extends Bird{
}

