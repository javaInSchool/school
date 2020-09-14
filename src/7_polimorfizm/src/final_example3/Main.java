package final_example3;

public class Main {
    public static void main(String[] args) {
        final Human h = new Human(25);
        h.address = "Pravdu";
        //h.birthday = 21;

    }
}
class Human {
    static final String NAME = "Serg";
    String address;
    int weight;
    final int birthday;
    Human(int birthday){
        this.birthday = birthday;
    }
}

