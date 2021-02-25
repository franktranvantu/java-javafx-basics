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
        button.setOnAction(actionEvent -> {
            boolean answer = ConfirmBox.display("Confirm change", "Are you sure you want to send naked pics?");
            System.out.println(answer);
        });

        StackPane layout = new StackPane(button);

        Scene scene = new Scene(layout, 300, 250);

        stage.setTitle("Create alert boxes");
        stage.setScene(scene);
        stage.show();
    }
}
