module ru.bolshakova.bolshakova_task2_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bolshakova.bolshakova_task2_1 to javafx.fxml;
    exports ru.bolshakova.bolshakova_task2_1;
}