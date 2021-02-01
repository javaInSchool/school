package _7_polimorfizm.lesson72_toString_equals;

public class Swallow {
    String name;

    Swallow(String name){
        this.name = name;
    }

    Swallow(){
    }

    @Override
    public String toString() {
        return "Swallow Object: "+ this.name;
    }
}