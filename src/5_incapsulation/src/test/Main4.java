package test;

public class Main4 {
    boolean b;
    public static void main(String[] args) {
        Main4 d = new Main4();
        for(;!d.b;new MyWork()){
            new MyWork(d);
            System.out.println(d.b);
        }
    }
}
class MyWork{
    MyWork(){

    }
    MyWork(Main4 d){
        d.b = !d.b;
    }
}
