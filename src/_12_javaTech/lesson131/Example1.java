public class Example1 {

    public static void fire(){
        System.out.println("Fire static :: syntax!!!");
    }

    public static void main(String[] args) {

        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        //event subscribe
        //sw.consumer = lamp;
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);


        //Example of simple class usage
        /*
        class Fire implements ElectricityConsumer{
            @Override
            public void electricityOn() {
                System.out.println("Fire!!!");
            }
        }
        sw.addElectricityListener(new Fire());
        */
        //Example2 of simple class usage, anonymous class
        sw.addElectricityListener(
                new ElectricityConsumer() {
                    @Override
                    public void electricityOn() {
                        System.out.println("Fire anonymous");
                    }
                }
        );
        //lambda instead of anonymous class
        sw.addElectricityListener( () -> System.out.println("Fire lambda!!!") );
        // brackets are required when method in interface has 0 or more then 1 parameters
        sw.addElectricityListener( Example1::fire );

        sw.switchOn();
    }
}
