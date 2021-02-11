package java7.object_oriented_prog.lesson7;

public class Main {
    public static void main(String[] args) {
        int x = 7;
        double y = 9;
        char c = 'A'; //65,
        System.out.println(x + y + c);
        //16A
        //79A
        //xyc
        //81
        //81.0
        String data = "Hello, world!";
        System.out.println(data.length());
        //chatAt(3);
        //data.indexOf("o",6);

        Cat myCat = new Cat();
        myCat.name = "Murzik";
        myCat.age = 5;

        myCat.say();
        System.out.println("Cat catch: " +
                myCat.catchMouse()
        );
    }
}
