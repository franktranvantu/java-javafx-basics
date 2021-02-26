package com.franktran;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
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

        TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(400);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Product, String> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<Product, String> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Laptop", 859.00, 20));
        products.add(new Product("Toilet", 2.49, 198));
        products.add(new Product("Corn", 1.49, 12));

        TableView<Product> tableView = new TableView<>();
        tableView.setItems(products);
        tableView.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

        TextField nameInput, priceInput, quantityInput;

        nameInput = new TextField();
        nameInput.setPromptText("Product name");

        priceInput = new TextField();
        priceInput.setPromptText("Product price");

        quantityInput = new TextField();
        quantityInput.setPromptText("Product quantity");

        Button addButton, deleteButton;

        addButton = new Button("Add");
        addButton.setOnAction(actionEvent -> {
            String name = nameInput.getText();
            double price = Double.parseDouble(priceInput.getText());
            int quantity = Integer.parseInt(quantityInput.getText());
            products.add(new Product(name, price, quantity));

            nameInput.clear();
            priceInput.clear();
            quantityInput.clear();
        });

        deleteButton = new Button("Delete");
        deleteButton.setOnAction(actionEvent -> {
            int selectedIndex = tableView.getSelectionModel().getSelectedIndex();
            products.remove(selectedIndex);
        });

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, deleteButton);

        VBox layout = new VBox(20);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(tableView, hBox);

        Scene scene = new Scene(layout, 600, 400);

        window.setTitle("Adding and Deleting table rows");
        window.setScene(scene);
        window.show();
    }
}
