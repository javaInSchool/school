package javaFXapp3;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.event.*;
import javafx.geometry.*;

public class Dispatcher extends Application{
	Label answer = new Label("0");
	Button btnPlus = new Button("Plus");
	Button btnMinus = new Button("Minus");
	int count;
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage myStage){
		myStage.setTitle("Calculator");
		FlowPane rootNode = new FlowPane(20,20);
		rootNode.setAlignment(Pos.CENTER);
		Scene myScene = new Scene(rootNode,500,120);
		myStage.setScene(myScene);
		answer.setFont(new Font("Arial Bold",40));
		btnPlus.setMinSize(50, 50);
		btnMinus.setMinSize(50, 50);
		btnPlus.setFont(new Font("Arial Bond", 20));
		btnMinus.setFont(new Font("Arial Bond", 20));
		
		btnPlus.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				count++;
				answer.setText("" + count);
			}
		});
		
		btnMinus.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae){
				count--;
				answer.setText("" + count);
			}
		});
		rootNode.getChildren().addAll(btnPlus,answer,btnMinus);
		myStage.show();
	}
	
}

