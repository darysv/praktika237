module ru.bolshakova.bolshakovatask5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.bolshakova.bolshakovatask5 to javafx.fxml;
    exports ru.bolshakova.bolshakovatask5;
}