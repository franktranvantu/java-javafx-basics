package com.franktran;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
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

        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("_Edit");
        Menu viewMenu = new Menu("View");

        MenuItem newItem = new MenuItem("New");
        newItem.setOnAction(actionEvent -> {
            System.out.println("New");
        });

        MenuItem openItem = new MenuItem("Open...");
        MenuItem openRecentItem = new MenuItem("Open Recent");
        MenuItem separatorItem1 = new SeparatorMenuItem();
        MenuItem settingItem = new MenuItem("Setting...");
        MenuItem separatorItem2 = new SeparatorMenuItem();
        MenuItem exitItem = new MenuItem("Exit");

        MenuItem cutItem = new MenuItem("Cut");
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");
        pasteItem.setDisable(true);

        menuBar.getMenus().addAll(fileMenu, editMenu, viewMenu);

        fileMenu.getItems().addAll(newItem, openItem, openRecentItem, separatorItem1, settingItem, separatorItem2, exitItem);

        editMenu.getItems().addAll(cutItem, copyItem, pasteItem);

        BorderPane layout = new BorderPane();
        layout.setTop(menuBar);
        layout.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(layout, 600, 400);

        window.setTitle("Handling menu clicks");
        window.setScene(scene);
        window.show();
    }
}
