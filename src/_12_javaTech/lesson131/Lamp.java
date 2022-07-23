public class Lamp implements ElectricityConsumer{
    public void lightOn(){
        System.out.println("Light On");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }
}
