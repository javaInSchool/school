package java7.javaFX.lesson3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField wPool;
    public TextField lPool;
    public TextField dPool;
    public Label result;

    @FXML
    public void calc(){
        double wNum = Double.parseDouble( wPool.getText() );
        double lNum = Double.parseDouble( lPool.getText() );
        double dNum = Double.parseDouble( dPool.getText() );

        double volume = wNum * lNum * dNum;

        result.setText(result.getText() + volume);
    }
    @FXML
    public void closeWindow(){
        System.exit(0);
    }

}