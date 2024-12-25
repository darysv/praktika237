module ru.bolshakova.pagetopage1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bolshakova.pagetopage1 to javafx.fxml;
    exports ru.bolshakova.pagetopage1;
    exports ru.bolshakova.pagetopage1.controller;
    opens ru.bolshakova.pagetopage1.controller to javafx.fxml;
}