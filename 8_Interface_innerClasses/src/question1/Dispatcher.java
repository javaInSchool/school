package question1;

public class Dispatcher {
    public static void main(String[] args) {
        Cat c = new Cat(){
            void move(){
                super.move();
                System.out.println("anonymous Cat");
                display();
            }
            void display(){
                System.out.println("new anonymous method");
            }
        };
        //c.display(); //compile error
    }
}

class Cat{
    void move(){
        System.out.println("real Cat");
    }
}
