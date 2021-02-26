package com.franktran;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
	    launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Properties");

        Person person = new Person();
        person.firstNameProperty().addListener((value, oldValue, newValue) -> {
            System.out.println(newValue);
        });

        Button button = new Button("Click me!");
        button.setOnAction(actionEvent -> person.setFirstName("Frank"));

        StackPane layout = new StackPane(button);

        Scene scene = new Scene(layout, 300, 250);

        stage.setScene(scene);
        stage.show();
    }
}
