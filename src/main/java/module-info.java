@SuppressWarnings("module")
module com.example.upsdowns2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.upsdowns2 to javafx.fxml;
    exports com.example.upsdowns2;
    exports com.example.upsdowns2.controller;
    opens com.example.upsdowns2.controller to javafx.fxml;
}