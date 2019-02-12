package hashcode;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object object = new Object();
        int hCode;
        hCode = object.hashCode();
        System.out.println(hCode);

        Animal a = new Animal();
        System.out.println(a.hashCode());
        a.age = 5;
        a.type = "Dog";
        System.out.println(a.hashCode());
    }
}

class Animal{
    int age;
    String type;
    void say() {
        System.out.println("different sounds");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(type, animal.type);
    }

    @Override
    public int hashCode() {
        return (this.age-3)*7;
    }
}