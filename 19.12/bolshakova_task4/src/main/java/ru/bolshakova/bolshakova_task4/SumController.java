package ru.bolshakova.bolshakova_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField TxtA;

    @FXML
    private TextField TxtB;

    @FXML
    private TextField TxtC;

    @FXML
    private Label rcK;

    @FXML
    private Label rcM;

    @FXML
    private Label rcY;

    @FXML
    private Button resultButton;

    @FXML
    void resultButtonOnAction(ActionEvent event) {
        double a = Double.parseDouble(TxtA.getText());
        double b = Double.parseDouble(TxtB.getText());
        double c = Double.parseDouble(TxtC.getText());
        double m = (a + Math.pow(b,2))/c;
        rcM.setText("" +m);
        double k = m % 3;
        rcK.setText("" +k);
        double y;
        if (k == 0) {
            y = Math.floor(Math.pow(Math.E,m+c));
            rcY.setText("" +y);
        } else if (k == 1) {
            y = Math.floor(Math.log(a/b));
            rcY.setText("" +y);
        } else if (k == 2) {
            y = Math.floor(Math.sqrt(Math.abs(Math.pow(a+b,2)+c)));
            rcY.setText("" +y);
        }
    }
}




