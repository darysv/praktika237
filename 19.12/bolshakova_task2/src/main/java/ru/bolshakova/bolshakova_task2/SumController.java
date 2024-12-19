package ru.bolshakova.bolshakova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button btnCount;

    @FXML
    private Label ibiCount;

    @FXML
    private TextField txtNum1;

    @FXML
    private TextField txtNum2;

    @FXML
    private TextField txtNum3;

    @FXML
    void CountButtonOnAction(ActionEvent event) {
        int num1 = Integer.parseInt(txtNum1.getText());
        int num2 = Integer.parseInt(txtNum2.getText());
        int num3 = Integer.parseInt(txtNum3.getText());
        int positiveCount=0;
        if(num1>0)positiveCount++;
        if(num2>0)positiveCount++;
        if (num3>0)positiveCount++;

        ibiCount.setText("Положительное количество:"+positiveCount);
        ibiCount.setText("Неккоректный ввод чисел");
    }
}

