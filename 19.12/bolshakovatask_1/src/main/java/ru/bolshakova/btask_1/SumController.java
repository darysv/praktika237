package ru.bolshakova.btask_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button compareButton;

    @FXML
    private TextField numberinput;

    @FXML
    private Label resultLabel;

    @FXML
    void compButtonOnAction(ActionEvent event) {
        int num=Integer.parseInt(numberinput.getText().toString());
        if (num<10||num>99){
        }
        int firstDigit=num/10;
        int secondDigit=num%10;
        if (firstDigit>secondDigit) {
            resultLabel.setText("Первая цифра больше");
        }else if (firstDigit<secondDigit) {
            resultLabel.setText("Вторая цифра больше");
        }else{
            resultLabel.setText("Неверный ввод.Введите двузначное число");

        }

    }

}
