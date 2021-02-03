package _8_interface_innerclass.lesson89_multiInheritance.multiInheritance;

public class Main {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Computer c1 = new Computer();
        Computer c2 = new Computer();
        Computer[] c = {c1,c2,m1};   //Mobile extends Computer

        Phone[] p = {p1,p2,m2.makePhone()};

        for (Phone temp : p) {
            temp.process();
        }
    }
}

class Mobile extends Computer{
    Phone makePhone(){
        return new Phone(){
            @Override
            void process(){
                super.process();
                System.out.println("Mobile extends Phone");
            }
        };
    }
    @Override
    void process(){
        super.process();
        System.out.println("Mobile");
    }
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