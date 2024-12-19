module ru.bolshakova.btask_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bolshakova.btask_1 to javafx.fxml;
    exports ru.bolshakova.btask_1;
}