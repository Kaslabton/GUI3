module com.example.gui3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gui3 to javafx.fxml;
    exports com.example.gui3;
}