module com.example.lab8_fixed {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab8_fixed to javafx.fxml;
    exports com.example.lab8_fixed;
}