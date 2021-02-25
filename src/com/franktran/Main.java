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
        Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel, 0, 0);

        TextField nameInput = new TextField();
        nameInput.setPromptText("Username here...");
        GridPane.setConstraints(nameInput, 1,0);

        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 1);

        TextField passwordInput = new TextField();
        passwordInput.setPromptText("Password here...");
        GridPane.setConstraints(passwordInput, 1,1);

        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1, 2);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);
        grid.getChildren().addAll(nameLabel, nameInput, passwordLabel, passwordInput, loginButton);

        Scene scene = new Scene(grid, 300, 200);

        stage.setScene(scene);
        stage.setTitle("Embedding layouts");
        stage.show();
    }
}
