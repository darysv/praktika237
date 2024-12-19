package ru.bolshakova.bolshakovatask5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SumController {

    @FXML
    private Button btnButton;

    @FXML
    private ImageView pctr;

    @FXML
    private Label resultLabel;

    @FXML
    private TextField xTextField;

    @FXML
    private TextField yTextField;

    @FXML
    void btnButtonOnAction(ActionEvent event) {
        double x = Double.parseDouble(xTextField.getText().toString());
        double y = Double.parseDouble(yTextField.getText().toString());
        Image image = new Image(getClass().getResourceAsStream("pctr.png.png"));
        pctr.setImage(image);
        if (y<Math.abs(x)||y>15) {
            resultLabel.setText("Нет");
        } else if (y==Math.abs(x)||y==15) {
            resultLabel.setText("На границе");
        } else {
            resultLabel.setText("Да");
        }
    }
}



