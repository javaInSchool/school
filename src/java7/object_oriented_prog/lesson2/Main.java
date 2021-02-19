package java7.object_oriented_prog.lesson2;

public class Main {
    public static void main(String[] args) {
        SpaceObject n14548;
        n14548 = new SpaceObject();
        System.out.println(n14548.flyingToTheEarth);

        n14548.name = "Asteroid Informatika";

        System.out.println(n14548.name);

        SpaceObject newObject = new SpaceObject();
        newObject.type = "Cometa";
        newObject.speed = 300;
        newObject.weight = 10000;

    }
}
