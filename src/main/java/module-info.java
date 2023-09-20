module com.mx.antonioguerrero.hotel.hotel_alura {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires c3p0;
    requires java.sql;
    requires java.naming;

    opens com.mx.antonioguerrero.aluraverso to javafx.fxml;
    exports com.mx.antonioguerrero.aluraverso;
    exports com.mx.antonioguerrero.aluraverso.view;
    opens com.mx.antonioguerrero.aluraverso.view to javafx.fxml;
}