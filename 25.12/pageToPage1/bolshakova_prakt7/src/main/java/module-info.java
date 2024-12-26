module ru.bolshakova.bolshakova_prakt7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bolshakova.bolshakova_prakt7 to javafx.fxml;
    exports ru.bolshakova.bolshakova_prakt7;
    exports ru.bolshakova.bolshakova_prakt7.controller;
    opens ru.bolshakova.bolshakova_prakt7.controller to javafx.fxml;
}