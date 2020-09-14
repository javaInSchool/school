package anonymousInnerClassEkhelExample2;

public class Dispatcher {
    static void takesD(D d){}
    static void takesE(E e){}
    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        //takesE(z); // compile error - class Z does not extends class E
        takesE(z.makeE());
    }
}

class D{}
abstract class E{}

class Z extends D{
    E makeE(){
        return new E(){};
    }
}