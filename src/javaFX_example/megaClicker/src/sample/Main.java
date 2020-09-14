package javaFX_example.megaClicker.src.sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.EventListener;

public class Main extends Application {
    Label lemonsProfit = new Label("1");
    Label lemonUpCost = new Label("5");
    Button lemonsBuy = new Button("Buy");
    Label lemonLvl = new Label("1");
    Label score = new Label("0");

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("MegaClicker");
        primaryStage.setScene(new Scene(root, 300, 275));

        lemonsBuy.setOnAction(new lemonHandler());

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
class lemonHandler implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent event) {

    }
}
