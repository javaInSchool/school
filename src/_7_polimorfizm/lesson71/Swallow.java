package _7_polimorfizm.lesson71;
public class Swallow extends Bird{
    String name;
    Swallow(String name){
        this.name = name;
    }
    Swallow(){
    }

    @Override
    public String toString() {
        return "Swallow Object: "+
                this.name;
    }
}