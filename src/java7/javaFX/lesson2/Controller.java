package java7.javaFX.lesson2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField data;
    public Label result;

    @FXML
    public void sentData(){
        String text = data.getText();
        result.setText(text);
    }
}
