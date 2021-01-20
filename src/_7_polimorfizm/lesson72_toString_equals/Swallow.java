package _7_polimorfizm.lesson72_toString_equals;

import _7_polimorfizm.lesson71.Bird;

public class Swallow extends Bird {
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