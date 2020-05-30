module main {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.persistence;

    opens main to javafx.fxml;
    exports main;
}
