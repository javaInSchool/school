package javaFX.src.sampleSimpleCodeMachine;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Calendar;

public class Controller {

    public TextField plainText;
    public TextField cipherText;

    public void encode(){
        String data = plainText.getText();
        StringBuilder sb = new StringBuilder(data);
        for (int i = 0, n = data.length(); i < n; i++){
            sb.setCharAt(i, (char)(sb.charAt(i)+1));
        }
        cipherText.setText(sb.toString());
    }

    public void decode(){
        String data = cipherText.getText();
        StringBuilder sb = new StringBuilder(data);
        for (int i = 0, n = data.length(); i < n; i++){
            sb.setCharAt(i, (char)(sb.charAt(i)-1));
        }
        plainText.setText(sb.toString());
    }

    public void reset(){
        cipherText.setText("");
        plainText.setText("");
    }
}
