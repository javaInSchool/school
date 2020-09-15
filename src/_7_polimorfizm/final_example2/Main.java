package final_example2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Human h = new Human(25);
        //h.birthday = 26; //compile error

        final int x = randomNumber();

    }
    static int randomNumber(){
        return (int)(Math.random()*100);
    }
}

class Human{
    final int birthday;
    String surname;

    public Human(int birthday) {
        this.birthday = birthday;
    }
}
