package ru.bolshakova.bolshakova_task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label aResultLabel;

    @FXML
    private TextField aTextField;

    @FXML
    private Label bResultLabel;

    @FXML
    private TextField bTextField;

    @FXML
    private Label cResultLabel;

    @FXML
    private TextField cTextField;

    @FXML
    private Button processButton;

    @FXML
    void processButton(ActionEvent event) {
        double a=Double.parseDouble(aTextField.getText());
        double b=Double.parseDouble(bTextField.getText());
        double c=Double.parseDouble(cTextField.getText());

        if (a<=b&&b<=c){
            a*=2;
            b*=2;
            c*=2;
        }else{
            a=-a;
            b=-b;
            c=-c;
        }
        aResultLabel.setText("A:"+String.format("%.2f",a));
        bResultLabel.setText("B:"+String.format("%.2f",b));
        cResultLabel.setText("C:"+String.format("%.2f",c));
        processButton.setText("Неккоректный ввод чисел!");

    }

}
