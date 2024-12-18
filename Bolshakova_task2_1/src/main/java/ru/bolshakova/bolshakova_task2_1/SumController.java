package ru.bolshakova.bolshakova_task2_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button calculateButton;

    @FXML
    private Label resultLaqbel;

    @FXML
    private TextField seconddsinput;

    @FXML
    void lehgthButtonOnAction(ActionEvent event) {
        int n=Integer.parseInt(seconddsinput.getText().toString());
        int s=n%60;
        resultLaqbel.setText("Количество секунд с начала последней минуты:"+n);

    }

}
