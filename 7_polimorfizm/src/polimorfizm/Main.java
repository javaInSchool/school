package polimorfizm;

public class Main {
    public static void main(String[] args) {
        Bird ostrich = new Ostrich();
        Bird owl = new Owl();
        Bird pinguin = new Pinguin();

        Bird[] b = {ostrich, owl, pinguin};
        for (Bird temp : b) {
            temp.move();
        }

        Ostrich ost1 = new Ostrich();
        Ostrich ost2 = ost1.createBird();
    }
}

class Bird{
    void move() {
        System.out.println("Different ways");
    }
    Bird createBird(){
        return new Bird();
    }

}

class Ostrich extends Bird{
    @Override
    void move() {
        System.out.println("Run");
    }
    @Override
    Ostrich createBird(){
        return new Ostrich();
    }

}
class Owl extends Bird{
    @Override
    void move() {
        System.out.println("Fly");
    }

}
class Pinguin extends Bird{
    @Override
    void move() {
        System.out.println("Swim");
    }
}
