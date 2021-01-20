package _7_polimorfizm.lesson75_polimorf;

public class Main {
    public static void main(String[] args) {
        int x = 5;      //32
        double y = x;   //64
        //int z = y;

        Bird b = new Bird();
        Object c = b;
        Swallow s = new Swallow();
        b = s;
        Bird p = new Pinguin(); //1 тип полиморфизма
        Bird st = new Straus();
        Bird[] zoo = {b,st,p};

        for (Bird temp: zoo) {
            temp.move();
        }

        birdMoves( new Pinguin() ); //2 тип полиморфизма
        Straus st2 = new Straus();
        birdMoves( st2 );           //2 тип полиморфизма
        birdMoves( b );

        Swallow sw = (Swallow) s.createBird();
        //Pinguin p2 = (Pinguin) s.createBird(); //runtime error
    }
    static void birdMoves(Bird bird){
        bird.move();
    }
}
