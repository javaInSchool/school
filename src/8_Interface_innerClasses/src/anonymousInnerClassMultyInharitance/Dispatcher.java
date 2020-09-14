package anonymousInnerClassMultyInharitance;

public class Dispatcher {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.process();

        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Computer c1 = new Computer();
        Computer c2 = new Computer();
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        Computer [] c = {c1,c2,m1};   //Mobile extends Computer

        Phone[] p = {p1,p2,m2.makePhone()};        //compile error, Mobile does not extends Phone

        for (Computer temp: c) {
            temp.process();
        }
        for (Phone temp: p) {
            temp.process();
        }
    }
}

class Phone{
    void process(){
        System.out.println("Phone");
    }
}
class Computer{
    void process(){
        System.out.println("Computer");
    }
}
//class Mobile extends Phone, Computer{   //compile error - multiply extends is not permitted
//}
class Mobile extends Computer{
    Phone makePhone(){
        return new Phone(){
            void process(){
                super.process();
                System.out.println("Mobile extends Phone");
            }
        };
    }
    void process(){
        super.process();
        System.out.println("Mobile");
    }

}