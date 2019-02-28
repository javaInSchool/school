package multiInheritance;

public class Main {
    public static void main(String[] args) {

    }
}

class Mobile extends Computer{

}

class Computer{
    void process(){
        System.out.println("computer processing...");
    }
}

class Phone{
    void process(){
        System.out.println("phone ring...");
    }
}