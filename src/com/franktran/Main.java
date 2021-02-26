package com.franktran;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    private Scene scene1, scene2;

    public static void main(String[] args) {
	    launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;

        Label label1 = new Label("The first scene");
        Button button1 = new Button("Go to second scene");
        button1.setOnAction(actionEvent -> window.setScene(scene2));

        VBox layout1 = new VBox(20);
        layout1.setAlignment(Pos.CENTER);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 300, 200);

        Button button2 = new Button("Go to first scene");
        button2.setOnAction(actionEvent -> window.setScene(scene1));

        StackPane layout2 = new StackPane(button2);
        scene2 = new Scene(layout2, 600, 300);

        window.setTitle("Switching Scenes");
        window.setScene(scene1);
        window.show();
    }
}
