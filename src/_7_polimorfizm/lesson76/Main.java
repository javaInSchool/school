package _7_polimorfizm.lesson76;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog(15);
        //d.birthday = 16; //compile error

        final int n = setN(5);
        //n = 6;        //compile error

        int n3 = n; //final можна присвоїти у іншу змінну, без проблем

    }
    static int setN(int i){
        return i;
    }

    static void getName(Dog d){
        System.out.println(d.name);
    }
}
