package _7_polimorfizm.lesson72_toString_equals;

public class Dog {
    String name;
    int price;
    String breed;

    public Dog(String name, int price, String breed) {
        this.name = name;
        this.price = price;
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o){
        //System.out.println(name);
        boolean result;
        if (this.name.equals(  ( (Dog) o). name )  == true){
            if ( this.price == ( (Dog) o).price){
                result = true;
            }else{
                result = false;
            }
        }else{
            result = false;
        }
        return result;
    }

}
