package javaFX.javaFXapp.src.javaFXapp;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;

public class Dispatcher extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage myStage){
		myStage.setTitle("First app");
		FlowPane rootNode = new FlowPane();
		Scene myScene = new Scene(rootNode,300,200);
		myStage.setScene(myScene);
		Label myLabel = new Label("Hello world!");
		Label otherLabel = new Label("Hello world!");
		myLabel.setFont(new Font("Arial Bond", 80));
		otherLabel.setFont(new Font("Times New Roman",40));
		rootNode.getChildren().addAll(myLabel,otherLabel);
		myStage.show();
	}
}
