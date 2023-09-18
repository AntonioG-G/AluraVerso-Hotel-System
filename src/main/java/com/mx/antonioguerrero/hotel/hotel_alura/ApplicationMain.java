package com.mx.antonioguerrero.hotel.hotel_alura;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationMain.class.getResource("/FXML/ViewConstructor.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1268, 837);
        stage.setTitle("Hotel Alura");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}