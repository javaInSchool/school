package _10_InputOutput.lesson121;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Cat c = new Cat("Murzik", 12, 6);

        c.writeExternal(new ObjectOutputStream(
                new FileOutputStream("src/_10_InputOutput/lesson121/object.dat")));

        Cat myNewCat = new Cat();

        try {
            myNewCat.readExternal(new ObjectInputStream(
                     new FileInputStream("src/_10_InputOutput/lesson121/object.dat")));
        }catch(ClassNotFoundException cnfe){
            System.out.println("Class not found");
        }

        System.out.println(myNewCat);

    }
}
class Cat implements Externalizable{
    public String name;
    public int age;
    public int weight;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Cat(){}

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
        out.writeInt(weight);
        out.flush();
        out.close();
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = (String) in.readObject();
        this.age = in.readInt();
        this.weight = in.readInt();
        in.close();
    }
}
