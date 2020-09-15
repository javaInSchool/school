package equals_example;

public class Main {
    public static void main(String[] args) {
        String s1 = new String("Oleh");
        String s2 = new String("Sergei");
        String s3 = new String("Oleh");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        Dog d1 = new Dog("Rex","Bull", 4);
        Dog d2 = new Dog("Sharik","Dvorterer", 10);
        Dog d3 = new Dog("Rex","Bull", 4);

        System.out.println(d1 == d2);
        System.out.println(d1 == d3);

        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
    }
}

class Dog{
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "my Dog " + name;
    }
    @Override
    public boolean equals(Object d) {
        boolean result =    this.age==((Dog)d).age &&
                            this.breed.equals(((Dog)d).breed) &&
                            this.name.equals(((Dog)d).name);
        return result;

    }

}