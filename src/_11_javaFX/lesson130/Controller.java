package _11_javaFX.lesson130;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {
    public TextField w;
    public TextField l;
    public TextField d;
    public Label result;
    public Button goToTreeBank;
    @FXML
    void initialize(){
        goToTreeBank.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("newLife.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {}
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setTitle("TreeBank");
                stage.setScene(new Scene(root));
                stage.setResizable(false);

                Stage stagePrev = (Stage) goToTreeBank.getScene().getWindow();
                stagePrev.close();

                stage.showAndWait();


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
