package com.franktran;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
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

        IntegerProperty x = new SimpleIntegerProperty(3);
        IntegerProperty y = new SimpleIntegerProperty();

        y.bind(x.multiply(10));

        Button button = new Button("Click me!");
        button.setOnAction(actionEvent -> {
            x.setValue(5);
            System.out.println(x.getValue());
            System.out.println(y.getValue());
        });

        StackPane layout = new StackPane(button);

        Scene scene = new Scene(layout, 300, 250);

        stage.setScene(scene);
        stage.show();
    }
}
