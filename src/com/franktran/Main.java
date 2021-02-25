package com.franktran;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    private List<String> programs = new ArrayList();

    public static void main(String[] args) {
	    launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        CheckBox htmlCheckBox = new CheckBox("HTML");
        htmlCheckBox.setSelected(true);
        htmlCheckBox.setOnAction(actionEvent -> change(htmlCheckBox));
        htmlCheckBox.selectedProperty().addListener(
            (ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) -> change(htmlCheckBox)
        );

        CheckBox cssCheckBox = new CheckBox("CSS");
        cssCheckBox.selectedProperty().addListener(
            (ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) -> change(cssCheckBox)
        );

        CheckBox jsCheckBox = new CheckBox("JAVASCRIPT");
        jsCheckBox.selectedProperty().addListener(
                (ObservableValue<? extends Boolean> ov, Boolean old_val, Boolean new_val) -> change(jsCheckBox)
        );

        Button button = new Button("Learn Now");
        button.setOnAction(actionEvent -> System.out.println(String.format("You choose: %s", programs)));

        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.getChildren().addAll(htmlCheckBox, cssCheckBox, jsCheckBox, button);

        Scene scene = new Scene(vBox, 300, 200);

        stage.setScene(scene);
        stage.setTitle("Checkbox");
        stage.show();
    }

    private void change(CheckBox checkBox) {
        if (checkBox.isSelected()) {
            programs.add(checkBox.getText());
        } else {
            programs.remove(checkBox.getText());
        }
    }


}
