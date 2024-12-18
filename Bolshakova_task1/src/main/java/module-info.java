module ru.bolshakova.g {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bolshakova.g to javafx.fxml;
    exports ru.bolshakova.g;
}