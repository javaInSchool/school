package _7_polimorfizm.lesson70_super;

public class Animal {
    private String breed;
    private int weight;
    Animal(int weight, String breed){
        this.breed = breed;
        this.weight = weight;
    }
    public String getBreed(){
        return this.breed;
    }

    public int getWeight() {
        return weight;
    }
}
