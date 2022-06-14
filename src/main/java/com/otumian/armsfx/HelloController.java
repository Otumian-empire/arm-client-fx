package com.otumian.armsfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
//    add @FXML annotation and make the object private else make it public
//    this is a control - Label
    public Label nameText;

//    public Label welcomeText;
    @FXML
    private Label welcomeText;


    //    @FXML
//    This is an event fired when a control is hit
    public void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        nameText.setText("");
    }

    @FXML
    protected  void onSecondButtonClick() {
        welcomeText.setText("");
        nameText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onReset() {
        welcomeText.setText("");
        nameText.setText("");
    }
}