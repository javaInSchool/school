package _11_javaFX.lesson129;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    public TextField w;
    public TextField l;
    public TextField d;
    public Label result;
    public Button add;
    public Button add2;
    @FXML
    void initialize(){
        add.setOnAction(ActionEvent -> {
            System.out.println("Hello button");
        });
        add2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(actionEvent.getEventType());
            }
        });
    }

    @FXML
    public void calc(){
        double wid = 0, len = 0, dep = 0;

        try {
            wid = Double.parseDouble(w.getText());
            len = Double.parseDouble(l.getText());
            dep = Double.parseDouble(d.getText());
        }catch(NumberFormatException nfe){
            result.setText("Невірне значення поля ");
        }
        double r = wid * len * dep;
        result.setText("Об'єм акваріуму: " + r + " м3");
    }
}
