module com.otumian.armsfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.otumian.armsfx to javafx.fxml;
    exports com.otumian.armsfx;
}