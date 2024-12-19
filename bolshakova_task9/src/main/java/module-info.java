module ru.bolshakova.bolshakova_task9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bolshakova.bolshakova_task9 to javafx.fxml;
    exports ru.bolshakova.bolshakova_task9;
}