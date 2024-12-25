package ru.bolshakova.pagetopage1.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.bolshakova.pagetopage1.util.Manager.showSecondStage;

public class MainController implements Initializable {

    @FXML
    private Button goButton;

    @FXML
    void goButtonOnAction(ActionEvent event) {
        showSecondStage("go-view.fxml","Marathon Skills 2016-Register as a runner");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
goButton.setStyle("-fx-backround-color:  #2082AA; -fx-backround-radius: 5px;-fx-text-fill: ffffff");
    }
}
