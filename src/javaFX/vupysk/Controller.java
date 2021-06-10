package javaFX.vupysk;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {
    int count = 0;
    @FXML
    public Label result;
    public Button goToNewLife;

    @FXML
    public void toNewLife(){
            if (this.count < 13){
                if (this.count == 3){
                    result.setText(result.getText() + "Та досить вже! ");
                }
                if (this.count == 6){
                    result.setText(result.getText() + "Не марнуй часу на спроби! ");
                }
                if (this.count == 9){
                    result.setText(result.getText() + "Тобі всеодно не вдасться! ");
                }
                if (this.count == 12){
                    result.setText(result.getText() + "Ти зробив все , що зміг! ");
                }
                result.setText(result.getText() + "Здавайся! ");
                count++;
            }else {
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(getClass().getResource("newLife.fxml"));
                    try {
                        loader.load();
                    } catch (IOException e) {
                    }
                    Parent root = loader.getRoot();
                    Stage stage = new Stage();
                    stage.setTitle("New Life After School");
                    stage.setScene(new Scene(root));
                    stage.setResizable(false);

                    Stage stagePrev = (Stage) goToNewLife.getScene().getWindow();
                    stagePrev.close();

                    stage.showAndWait();
            }
        }

    @FXML
    public void goExit(){
        System.exit(0);
    }

    @FXML
    public void onceMore(){
        goToNewLife.setDisable(false);
    }
}
