package test;

public class Main {
    public static void main(String[] args) {
        Holder hold = new Holder();
    }
}
class Holder{
    char[] c = new char[2];
    {
        for (int i=0; i<c.length; i++){
            c[i]=action(c[i]);
            System.out.println(c[i]);
        }
    }
    public static char action(char c){
        return new Holder().c[0];
    }
}
