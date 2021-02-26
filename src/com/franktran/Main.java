package com.franktran;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
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

        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("HTML", "CSS", "JAVASCRIPT", "JAVA", "PYTHON");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        Button button = new Button("Click me");
        button.setOnAction(actionEvent -> {
            ObservableList<String> programs = listView.getSelectionModel().getSelectedItems();
            programs.forEach(System.out::println);
        });

        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(listView, button);

        Scene scene = new Scene(layout, 300, 200);

        window.setTitle("ListView");
        window.setScene(scene);
        window.show();
    }
}
