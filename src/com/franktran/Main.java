package com.franktran;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
	    launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Enter your age:");
        GridPane.setConstraints(label, 0, 0);

        TextField input = new TextField();
        GridPane.setConstraints(input, 1, 0);

        Button button = new Button("Check Age");
        GridPane.setConstraints(button, 1, 1);
        button.setOnAction(actionEvent -> isInteger(input));

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(8);
        grid.getChildren().addAll(label, input, button);

        Scene scene = new Scene(grid, 300, 200);

        stage.setScene(scene);
        stage.setTitle("Validate Input");
        stage.show();
    }

    private void isInteger(TextField input) {
        try {
            int year = Integer.parseInt(input.getText());
            System.out.println(String.format("You are %d years old", year));
        } catch (NumberFormatException e) {
            System.out.println(String.format("Error: %s is not a number", input.getText()));
        }
    }
}
