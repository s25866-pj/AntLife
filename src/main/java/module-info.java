module com.example.ant {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ant to javafx.fxml;
    exports com.example.ant;
}