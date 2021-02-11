package java7.object_oriented_prog.lesson7;

public class Cat {
    String name;
    int age;

    void say(){
        System.out.println("Meow, meow!");
    }
    int catchMouse(){
        return (int)(Math.random()*100+1);
    }
}
