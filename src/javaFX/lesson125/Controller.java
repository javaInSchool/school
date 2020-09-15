package javaFX.lesson125;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label answer;
    public TextField width;
    public TextField len;
    public TextField height;

    public void calc(){
        int w = Integer.parseInt(width.getText());
        int l = Integer.parseInt(len.getText());
        int h = Integer.parseInt(height.getText());
        int v = w*l*h;
        answer.setText("" + v);
    }
}
