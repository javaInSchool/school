package _7_polimorfizm.lesson78;

public class Dog {
    int weight;
    String name;

    public Dog(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{weight=" + weight +
                ", name='" + name + "\'}";
    }

    @Override
    public boolean equals(Object obj) {
        return this.weight == ( (Dog) obj).weight;
    }

    @Override
    public int hashCode(){
        return weight*4+this.name.charAt(1);
        // 3 * 4 + 101
    }
}
