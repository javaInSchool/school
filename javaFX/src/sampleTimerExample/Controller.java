package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.util.Calendar;

public class Controller {

    public Label time;
    public double start = 0;
    public double stop = 0;

    public void start(ActionEvent ae){
        Calendar c = Calendar.getInstance();
        start = c.getTimeInMillis();
        time.setText("Stopwatch is Running...");
    }

    public void stop(ActionEvent ae){
        Calendar c = Calendar.getInstance();
        stop = c.getTimeInMillis();
        time.setText("Elapsed time is " + (stop - start)/1000);
    }
}
