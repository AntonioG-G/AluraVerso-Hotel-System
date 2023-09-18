module com.mx.antonioguerrero.hotel.hotel_alura {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.mx.antonioguerrero.hotel.hotel_alura to javafx.fxml;
    exports com.mx.antonioguerrero.hotel.hotel_alura;
}