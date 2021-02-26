package com.franktran;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;

    public static void main(String[] args) {
	    launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("HTML", "CSS", "JAVASCRIPT");
        comboBox.setPromptText("What is your favorite program?");
        comboBox.setOnAction(actionEvent -> System.out.println(comboBox.getValue()));
        comboBox.setEditable(true);

        Button button = new Button("Click me");
        button.setOnAction(actionEvent -> System.out.println(comboBox.getValue()));

        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(comboBox, button);

        Scene scene = new Scene(layout, 300, 200);

        window.setTitle("ComboBox");
        window.setScene(scene);
        window.show();
    }
}
