package java7.javaFX;

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
