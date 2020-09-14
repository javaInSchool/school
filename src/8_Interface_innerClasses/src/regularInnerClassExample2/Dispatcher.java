package regularInnerClassExample2;

public class Dispatcher {
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
        void display( ){
            System.out.println("output: outer_х = " + outer_х) ;  //не правильно
            System.out.println("output: outer_х = " + Outer.this.outer_х) ;  //правильно
        }
    }
}

