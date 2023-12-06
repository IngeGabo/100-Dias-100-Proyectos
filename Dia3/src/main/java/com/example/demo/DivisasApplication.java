package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DivisasApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DivisasApplication.class.getResource("divisas-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 400);//Primero es el largo y luego la altura
        stage.setTitle("Dia 3");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}