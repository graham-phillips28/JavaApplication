module com.javaapplication.javaappmodel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javaapplication.javaappmodel to javafx.fxml;
    exports com.javaapplication.javaappmodel;
}