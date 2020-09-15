package inner_practice;

public class Main {
    public static void main(String[] args) {
        Airplane a1 = new Airplane();
        Rocket r1 = new Rocket();
        Spaceship s1 = new Spaceship();

        a1.anonymous(new Flying() { //anonymous class
            @Override
            public void howIsItFly() {
                System.out.println("I'm flying by wing...");
            }
        });

        r1.anonymous( ()-> { //lambda expression
                System.out.println("I'm flying by jet thrust...");
        });

        s1.anonymous(new Flying() {
            @Override
            public void howIsItFly() {
                System.out.println("I'm flying by wing and jet thrust...");
            }
        });

    }
}

class Spaceship extends Rocket{
}

class Rocket {
    void anonymous(Flying f){
        f.howIsItFly();
    }
}

class Airplane{
    void anonymous(Flying f){
        f.howIsItFly();
    }
}

interface Flying{
    void howIsItFly();
}