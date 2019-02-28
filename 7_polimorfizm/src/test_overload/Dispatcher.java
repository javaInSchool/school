package test_overload;

public class Dispatcher extends Lemon{
    public static void main(String[] args) {
        Lemon_Tree lt = new Lemon();
        //((Trees)lt).make_colour();
    }
}
class Trees{
}
class Lemon_Tree extends Trees{
    void make_colour(){
        System.out.println("Green");
    }
}
class Lemon extends  Lemon_Tree {
    void make_colour(){
        System.out.println("Yellow");
    }
}

