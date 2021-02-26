package com.franktran;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
	    launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Properties");

        Label label1 = new Label("Type into below, I will be changed");
        Label label2 = new Label();
        TextField input = new TextField();

        HBox hBox = new HBox(label1, label2);
        hBox.setAlignment(Pos.CENTER);

        VBox layout = new VBox(20);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(input, hBox);

        label2.textProperty().bind(input.textProperty());

        Scene scene = new Scene(layout, 300, 250);

        stage.setScene(scene);
        stage.show();
    }
}
