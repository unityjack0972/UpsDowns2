package com.example.upsdowns2.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UpsDownsController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}