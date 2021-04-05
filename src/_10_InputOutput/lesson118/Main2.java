package _10_InputOutput.lesson118;

import java.io.*;

public class Main2  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User u = new User("Serg", "test@gmail.com", "qwerty", "Pravdu");
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("src\\_10_InputOutput\\lesson118\\data.dat"));
        out.writeObject(u);
        out.flush();
        out.close();
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("src\\_10_InputOutput\\lesson118\\data.dat"));
        User newUser = (User)in.readObject();
        System.out.println(newUser.toString());
    }
}

class User implements Serializable{
    private String name;
    private String email;
    private transient String password;
    private Address address;

    public User(String name, String email, String password, String street) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = new Address(street);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
class Address{
    String street;

    public Address(String street) {
        this.street = street;
    }
}