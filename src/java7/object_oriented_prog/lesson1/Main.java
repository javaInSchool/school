package java7.object_oriented_prog.lesson1;

public class Main {
    public static void main(String[] args) {
        int n = 6;
        Human person1 = new Human();
        person1.age = 99;
        person1.height = 170.6;
        person1.isMan = false;
        person1.name = "Vasulisa";
        person1.surname = "Petrova";
        person1.weight = 79;

        Human person2 = new Human();
        person2.weight = 60.7;
        person2.name = "Kolya";

        System.out.println(person1.name);

        House h = new House();
    }
}
