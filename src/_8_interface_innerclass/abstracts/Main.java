package abstracts;

public class Main {
    public static void main(String[] args) {
        //SolarSystem ss = new SolarSystem(); compile error
        SolarSystem ss = new EarthPlanet();
        ss.spin();
    }
}

abstract class SolarSystem{
    abstract void spin();//{
        //System.out.println("Around Dark hole");
    //}
    SolarSystem(){
        System.out.println("You are in Solar System");
    }
}

class EarthPlanet extends SolarSystem{
    @Override
    void spin(){
        System.out.println("Around Sun, 3rd planet");
    }
}
class MarsPlanet extends SolarSystem{
    @Override
    void spin(){
        System.out.println("Around Sun, 4rd planet");
    }
}