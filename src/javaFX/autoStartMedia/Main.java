package javaFX.autoStartMedia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

//        Controller controller = new Controller();
//        FXMLLoader loader = new FXMLLoader();
//        loader.setController(controller);
//        Parent root = loader.load(getClass().getResource("sample.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Auto play tracks");
        primaryStage.setScene(new Scene(root, 550, 450));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
