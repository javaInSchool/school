package javaFX.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    public Label text;
    public String buffer = "";
    public String result = "";
    public int operation = 0;
    int count = 0;
    @FXML
    public void myAction(ActionEvent actionEvent) {
        count++;
        text.setText("" + count);
    }
    @FXML
    public void clean(ActionEvent actionEvent) {
        text.setText("");
    }
    @FXML
    public void add(ActionEvent actionEvent) {
        operation = 1;
        buffer = text.getText();
        text.setText("");
    }
    @FXML
    public void calc(ActionEvent actionEvent) {
        result = "" + (Integer.parseInt(buffer) +
                Integer.parseInt(text.getText()));
        text.setText(result);
        operation = 0;
    }
    @FXML
    public void one(ActionEvent actionEvent) {
        text.setText(text.getText() + "1");
    }
    @FXML
    public void two(ActionEvent actionEvent) {
        text.setText(text.getText() + "2");
    }

}
