package inner2;

public class Main {
    public static void main (String args[]) {
        Outer outer = new Outer ( );
        outer.test( );
    }
}
class Outer {
    int outer_х = 100;
    void test( ){
        Inner inner = new Inner( );
        inner.display( );
    }
    //inner class
    class Inner{
        int outer_х = 200;
        void display( ){
            System.out.println("output: outer_х = " + outer_х) ;  //не правильно
            System.out.println("output: outer_х = " + Outer.this.outer_х) ;  //правильно
        }
    }
}

