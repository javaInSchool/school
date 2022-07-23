import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private List<ElectricityConsumer> listeners =
            new ArrayList<>();
    public void addElectricityListener(ElectricityConsumer listener){
        //could also be checked on null and other
        listeners.add(listener);
    }
    public void removeElectricityListener(ElectricityConsumer listener){
        //could also be checked on null and other
        listeners.remove(listener);
    }
    public void switchOn(){
        System.out.println("Turned On");
        //consumer.electricityOn();
        for(ElectricityConsumer ec : listeners){
            ec.electricityOn();
        }
    }
}
