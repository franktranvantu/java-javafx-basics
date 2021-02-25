package com.franktran;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
	    launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button fileButton = new Button("File");
        Button editButton = new Button("Edit");
        Button viewButton = new Button("View");

        Button studentButton = new Button("Students");
        Button courseButton = new Button("Courses");
        Button scheduleButton = new Button("Schedules");

        HBox topMenu = new HBox();
        topMenu.getChildren().addAll(fileButton, editButton, viewButton);

        VBox leftMenu = new VBox();
        leftMenu.getChildren().addAll(studentButton, courseButton, scheduleButton);

        BorderPane layout = new BorderPane();
        layout.setTop(topMenu);
        layout.setLeft(leftMenu);

        Scene scene = new Scene(layout, 300, 250);

        stage.setScene(scene);
        stage.setTitle("Embedding layouts");
        stage.show();
    }
}
