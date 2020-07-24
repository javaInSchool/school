package javaFXcalc;

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
	Button[] digits = {new Button("0"), new Button("1"), new Button("2"),
						new Button("3"), new Button("4"), new Button("5"),
						new Button("6"), new Button("7"), new Button("8"),new Button("9")};
	Button btnPlus = new Button("Plus");
	Button btnMinus = new Button("Minus");
	int count;
	String data;
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
		for(Button temp: digits){
			temp.setMinSize(50,50);
			temp.setFont(new Font("Arial Bond", 20));
			//temp.setOnAction(new ButtonDigitHandler());
			rootNode.getChildren().add(temp);
		}
		btnPlus.setMinSize(50, 50);
		btnMinus.setMinSize(50, 50);
		btnPlus.setFont(new Font("Arial Bond", 20));
		btnMinus.setFont(new Font("Arial Bond", 20));
		
		btnPlus.setOnAction(new ButtonPlusHandler());
		btnMinus.setOnAction(new ButtonMinusHandler());
		
		Label label1 = new Label("Name:");
		final TextField textField = new TextField("Input your name");
		rootNode.getChildren().addAll(label1, textField);
		
		rootNode.getChildren().addAll(btnPlus, btnMinus, answer);
		myStage.show();
	}
	class ButtonPlusHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent ae){
			count++;
			answer.setText("" + count);
		}
	}
	class ButtonMinusHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent ae){
			count--;
			answer.setText("" + count);
		}
	}
//	class ButtonDigitHandler implements EventHandler<ActionEvent>{
//		public void handle(ActionEvent ae){
//			//data = textField.getText();
//			answer.setText(data);
//		}
//	}
}