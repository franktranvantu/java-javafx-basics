package com.franktran;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
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

        TreeItem<String> root = new TreeItem<>();
        root.setExpanded(true);

        TreeItem<String> out = new TreeItem<>("out");
        out.setExpanded(true);
        root.getChildren().add(out);

        TreeItem<String> production = new TreeItem<>("production");
        production.setExpanded(true);
        out.getChildren().add(production);

        TreeItem<String> src = new TreeItem<>("src");
        src.setExpanded(true);
        root.getChildren().add(src);

        TreeItem<String> pack = new TreeItem<>("com.franktran");
        pack.setExpanded(true);
        src.getChildren().add(pack);

        TreeItem<String> main = new TreeItem<>("Main");
        main.setExpanded(true);
        pack.getChildren().add(main);

        TreeView<String> treeView = new TreeView<>(root);
        treeView.setShowRoot(false);
        treeView.getSelectionModel().selectedItemProperty().addListener((value, oldValue, newValue) -> {
            if (newValue != null) {
                System.out.println(newValue.getValue());
            }
        });

        VBox layout = new VBox(20);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(treeView);

        Scene scene = new Scene(layout, 300, 200);

        window.setTitle("TreeView");
        window.setScene(scene);
        window.show();
    }
}
