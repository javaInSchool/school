package regularInnerClassExample;

public class Dispatcher {
    public static void main(String[] args) {
        Animal a = new Animal("Cat");

        Animal.InnerClass inner = a.new InnerClass();
        inner.weight = 12;
        inner.name = "Rex";
        inner.change();
        System.out.println(a.type);

        Animal.InnerClass.InnerTwice inner2 = inner.new InnerTwice();
    }
}

class Animal{
    String type;

    public Animal(String type) {
        this.type = type;
    }

    class InnerClass{
        int weight;
        String name;
        void change(){
            type = "Dog";
        }
        class InnerTwice{
        }
    }
}