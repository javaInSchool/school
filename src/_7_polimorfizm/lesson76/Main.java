package _7_polimorfizm.lesson76;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog(15);
        //d.birthday = 16; //compile error

        final int n = setN(5);
        //n = 6;        //compile error

        final Dog myDog = new Dog(10);
        myDog.name = "Rex";
        myDog.name = "Sharik";
        //myDog = new Dog(11); //compile error

        int n2 = (int)Double.NEGATIVE_INFINITY;

        int n3 = n;

    }
    static int setN(int i){
        return i;
    }

    static void getName(Dog d){
        System.out.println(d.name);
    }
}
