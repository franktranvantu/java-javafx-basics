package com.franktran;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;

    public static void main(String[] args) {
	    launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Click me!");
        button.setOnAction(actionEvent -> AlertBox.display("Title of Window", "Message of Window"));

        StackPane layout = new StackPane(button);

        Scene scene = new Scene(layout, 300, 250);

        stage.setTitle("Create alert boxes");
        stage.setScene(scene);
        stage.show();
    }
}
