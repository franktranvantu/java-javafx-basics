package com.franktran;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;

    public static void main(String[] args) {
	    launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Close program");
        button.setOnAction(actionEvent -> closeProgram());

        StackPane layout = new StackPane(button);

        Scene scene = new Scene(layout, 300, 250);

        window = stage;
        window.setOnCloseRequest(actionEvent -> {
            actionEvent.consume();
            closeProgram();
        });
        window.setTitle("Closing the Program Properly");
        window.setScene(scene);
        window.show();
    }

    private void closeProgram() {
        boolean answer = ConfirmBox.display("Confirm change", "Sure you want to exit?");
        if (answer) {
            window.close();
        }
    }
}
