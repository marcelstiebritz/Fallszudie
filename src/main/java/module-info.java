module com.example.fallszudie {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.fallszudie to javafx.fxml;
    exports com.example.fallszudie;
}