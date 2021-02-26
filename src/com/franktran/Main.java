package com.franktran;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
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
        Menu editMenu = new Menu("Edit");
        Menu viewMenu = new Menu("View");

        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open...");
        MenuItem openRecentItem = new MenuItem("Open Recent");
        MenuItem undoItem = new MenuItem("Undo Typing");

        menuBar.getMenus().addAll(fileMenu, editMenu, viewMenu);

        fileMenu.getItems().addAll(newItem, openItem, openRecentItem);

        editMenu.getItems().addAll(undoItem);

        BorderPane layout = new BorderPane();
        layout.setTop(menuBar);
        layout.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(layout, 600, 400);

        window.setTitle("Making menus");
        window.setScene(scene);
        window.show();
    }
}
