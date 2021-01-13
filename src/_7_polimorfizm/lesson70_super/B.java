package _7_polimorfizm.lesson70_super;

public class B extends A{
    int i;
    B(int a, int b){
        i = a;
        super.i = b;
    }
    void display(){
        System.out.println("i super " + super.i);
        System.out.println("i this " + i);
    }
}
