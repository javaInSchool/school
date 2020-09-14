import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) throws IOException {
        Person p = new Person(1,"John");
        Student s = new Student(2, "Oleg", "Java", 3000);
        Student s2 = new Student("Java", 4000,
                new Address("Park line", "Kyiv", "Ukraine"));
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("src/serialization_and_inheritance/data.dat")
        );
        out.writeObject(p);
        out.writeObject(s);
        out.writeObject(s2);
        out.flush();
        out.close();
    }
}

class Person implements Serializable{
    int id;
    String name;
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    Person(){}
}

class Student extends Person{
    String course;
    int fee;
    public Student(int id, String name, String course, int fee) {
        super(id, name);
        this.course = course;
        this.fee = fee;
    }

    Address address;
    public Student(String course, int fee, Address address) {
        this.address = address;
        this.course = course;
        this.fee = fee;
    }
}

class Address{
    String addressLine, city, country;
    public Address (String addressLine, String city, String country) {
        this.addressLine = addressLine;
        this.city = city;
        this.country = country;
    }
}