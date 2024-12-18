package ru.bolshakova.g;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextFireld;

    @FXML
    private TextField bTextField;

    @FXML
    private Button calculateButton;

    @FXML
    void calButtonOnActoin(ActionEvent event) {
        float a = Float.parseFloat(aTextFireld.getText().toString());
        float b = Float.parseFloat(bTextField.getText().toString());
        if (a>b) {
            float r = a % b;
            calculateButton.setText("Длина незанятой части отрезка:"+String.format("%.3f",r));
        }else {
            calculateButton.setText("Ощибка: убедитесь,что A>B и оба числа положительные");
        }


    }

}
