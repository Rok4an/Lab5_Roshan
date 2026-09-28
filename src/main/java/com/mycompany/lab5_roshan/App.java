package com.mycompany.lab5_roshan;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Label titleLabel = new Label("Bag Order Form");
        
        ListView<String> bagListView = new ListView<>();
        bagListView.getItems().addAll(
        "Full Decorative", 
        "Beaded", 
        "Pirate Design", 
        "Fringed", 
        "Leather", 
        "Plain");
        
       bagListView.setPrefHeight(120);
       ComboBox<Integer> quantityCombo = new ComboBox<>();
       
       for (int i = 1; i <= 10; i++) {
           quantityCombo.getItems().add(i);
       }
       
       HBox quantityBox = new HBox(10, new Label("Quantity"), quantityCombo);
       quantityBox.setAlignment(Pos.CENTER_LEFT);
       
       ToggleGroup sizeGroup = new ToggleGroup();
       RadioButton rbSmall = new RadioButton ("Small");
       RadioButton rbMedium = new RadioButton ("Medium");
       RadioButton rbLarge = new RadioButton ("Large");
       
       rbSmall.setToggleGroup(sizeGroup);
       rbMedium.setToggleGroup(sizeGroup);
       rbLarge.setToggleGroup(sizeGroup);
    }

    public static void main(String[] args) {
        launch();
    }

}