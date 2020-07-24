package sample_calc;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label result;
    public Label resultHistory;

    public void n0(ActionEvent ae){
        checkFirstDigit();
        result.setText(result.getText()+0);
    }

    public void n1(ActionEvent ae){
        checkFirstDigit();
        result.setText(result.getText()+1);
    }

    public void n2(ActionEvent ae){
        checkFirstDigit();
        result.setText(result.getText()+2);
    }

    public void n3(ActionEvent ae){
        checkFirstDigit();
        result.setText(result.getText()+3);
    }

    public void n4(ActionEvent ae){
        checkFirstDigit();
        result.setText(result.getText()+4);
    }

    public void n5(ActionEvent ae){
        checkFirstDigit();
        result.setText(result.getText()+5);
    }

    public void n6(ActionEvent ae){
        checkFirstDigit();
        result.setText(result.getText()+6);
    }

    public void n7(ActionEvent ae){
        checkFirstDigit();
        result.setText(result.getText()+7);
    }

    public void n8(ActionEvent ae){
        checkFirstDigit();
        result.setText(result.getText()+8);
    }

    public void n9(ActionEvent ae){
        checkFirstDigit();
        result.setText(result.getText()+9);
    }

    public void clearAll(ActionEvent ae){
        result.setText("0");
        resultHistory.setText("");
    }

    public void clear(ActionEvent ae){
        result.setText("0");
    }

    public void checkFirstDigit(){
        int temp = Integer.parseInt(result.getText());
        if(temp == 0){
            result.setText("");
        }
    }
}
