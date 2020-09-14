package javaFX.src.sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label text;
    public String buffer = "";
    public String result = "";
    public int operation = 0;
    int count = 0;

    public void myAction(ActionEvent actionEvent) {
        count++;
        text.setText("" + count);
    }

    public void clean(ActionEvent actionEvent) {
        text.setText("");
    }

    public void add(ActionEvent actionEvent) {
        operation = 1;
        buffer = text.getText();
        text.setText("");
    }

    public void calc(ActionEvent actionEvent) {
        result = "" + (Integer.parseInt(buffer) +
                Integer.parseInt(text.getText()));
        text.setText(result);
        operation = 0;
    }

    public void one(ActionEvent actionEvent) {
        text.setText(text.getText() + "1");
    }

    public void two(ActionEvent actionEvent) {
        text.setText(text.getText() + "2");
    }

}
