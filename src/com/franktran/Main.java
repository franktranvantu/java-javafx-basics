package com.franktran;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
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

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("HTML", "CSS", "JAVASCRIPT");
        choiceBox.setValue("HTML");

        Button button = new Button("Click me");
        button.setOnAction(actionEvent -> System.out.println(choiceBox.getValue()));

        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(choiceBox, button);

        Scene scene = new Scene(layout, 300, 200);

        window.setTitle("Dropdown menu");
        window.setScene(scene);
        window.show();
    }
}
