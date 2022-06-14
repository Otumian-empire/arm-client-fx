package com.otumian.armsfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 300);
        stage.setTitle("Button Clicks Hello World Fx app");
        stage.setScene(scene);
        stage.show();*/

        // Create a button - controller
        Button firstBtn = new Button("First Button!");
        Button secondBtn = new Button("Second Button!");
        Button resetBtn = new Button("Reset all the Labels");

        Label firstLabel = new Label("I am first Label");
        Label secondLabel = new Label("I am second Label");

        // create a layout for the buttons and labels
        VBox vBoxLayout = new VBox();
        VBox firstLayout = new VBox();
        VBox secondLayout = new VBox();

        // we can a StackPane, FlowPane where the items are either wrapped at the
        // boundary, GridPane with hgap and vgap, BorderPane
        // add the controllers to the layout
        firstLayout.getChildren().addAll(firstLabel, firstBtn);
        secondLayout.getChildren().addAll(secondLabel, secondBtn);

        vBoxLayout.getChildren().addAll(firstLayout, secondLayout, resetBtn);

        // create a scene
        Scene scene = new Scene(vBoxLayout);

        // add scene to the stage
        stage.setScene(scene);

        // add title
        stage.setTitle("ARMS Desktop Client");

        // set width and height
        stage.setWidth(750);
        stage.setHeight(510);
        // we can set the width and height to full screen
        // stage.setFullScreen(true);

        /*stage.setMinWidth(550);
        stage.setMinHeight(400);

        stage.setMaxWidth(1000);
        stage.setMaxHeight(720);*/

        // show the stage
        stage.show();
        //  stage.close();

    }

    public static void main(String[] args) {
        launch();
    }
}