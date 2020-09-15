package javaFX.sample_css;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Label result;
    public TextField tf1;
    public TextField tf2;

    public void calc(){
        int number1 = Integer.parseInt(tf1.getText());
        int number2 = Integer.parseInt(tf2.getText());
        result.setText(""+(number1 + number2));
    }

}
