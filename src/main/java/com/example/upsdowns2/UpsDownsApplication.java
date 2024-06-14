package com.example.upsdowns2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UpsDownsApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(UpsDownsApplication.class.getResource("upsdowns-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 685, 478);
        stage.setTitle("Ups&Downs Library");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
