/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5_roshan;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 2550332
 */
public class App2 extends Application {
    
    private ComboBox<String> beverageCombo;
    private ComboBox<String> appetizerCombo;
    private ComboBox<String> mainCourseCombo;
    private ComboBox<String> dessertCombo;
    
    private Slider tipSlider;
    private Label subtotalLabel;
    private Label taxLabel;
    private Label tipLabel;
    private Label totalLabel;
    
    private static final double TAX_RATE = 0.05;

    @Override
    public void start(Stage stage) {
        beverageCombo = new ComboBox<>();
        beverageCombo.getItems().addAll("-- None --", "Tea", "Soft Drink", "Water", "Milk", "Juice");
        beverageCombo.setValue("-- None --");
        beverageCombo.setOnAction(e -> calculateBill());
        
        appetizerCombo = new ComboBox<>();
        appetizerCombo.getItems().addAll("-- None --", "Soup", "Salad", "Spring Rolls", "Garlic Bread", "Chips and Salsa");
        appetizerCombo.setValue("-- None --");
        appetizerCombo.setOnAction(e -> calculateBill());
        
        mainCourseCombo = new ComboBox<>();
        mainCourseCombo.setValue("-- None --");
        mainCourseCombo.getItems().addAll("-- None --", "Steak ", "Grilled Chicken", "Chicken Alfredo", "Turkey Club", "Shrimp Scampi", "Pasta", "Fish and Chips");
        mainCourseCombo.setOnAction(e -> calculateBill());
        
        dessertCombo = new ComboBox<>();
        dessertCombo.setValue("-- None --");
        dessertCombo.getItems().addAll("-- None --", "Apple Pie ", "Carrot Cake", "Mud Pie", "Pudding", "Apple Crisp");
        dessertCombo.setOnAction(e -> calculateBill());
        
        tipSlider = new Slider(0, 20, 15);
        tipSlider.setShowTickMarks(true);
        tipSlider.setShowTickLabels(true);
        tipSlider.setMajorTickUnit(5);
        tipSlider.setBlockIncrement(1);
        tipSlider.valueProperty().addListener((obs, oldVal, newVal) -> calculateBill());
        
        subtotalLabel = new Label("$0.00");
        taxLabel = new Label("$0.00");
        tipLabel = new Label("$0.00");
        totalLabel = new Label("$0.00");
        totalLabel.setStyle("-fx-font-weight: bold;");
        
        Button clearButton = new Button("Clear Bill");
        clearButton.setOnAction(e -> clearBill());
        
        GridPane grid = new GridPane();
        grid.setHgap(15);
        grid.setVgap(10);

        grid.add(new Label("Beverage:"), 0, 0);
        grid.add(beverageCombo, 1, 0);

        grid.add(new Label("Appetizer:"), 0, 1);
        grid.add(appetizerCombo, 1, 1);

        grid.add(new Label("Main Course:"), 0, 2);
        grid.add(mainCourseCombo, 1, 2);

        grid.add(new Label("Dessert:"), 0, 3);
        grid.add(dessertCombo, 1, 3);

        grid.add(new Label("Tip (%):"), 0, 4);
        grid.add(tipSlider, 1, 4);

        grid.add(new Label("Subtotal:"), 0, 5);
        grid.add(subtotalLabel, 1, 5);

        grid.add(new Label("Tax (5%):"), 0, 6);
        grid.add(taxLabel, 1, 6);

        grid.add(new Label("Tip Amount:"), 0, 7);
        grid.add(tipLabel, 1, 7);

        grid.add(new Label("Total:"), 0, 8);
        grid.add(totalLabel, 1, 8);

        grid.add(clearButton, 1, 9);

        VBox root = new VBox(15, grid);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 380, 460);
        stage.setTitle("Restaurant Bill Calculator");
        stage.setScene(scene);
        stage.show();
    }
    
    private double getBeveragePrice(String item) {
        if (item == null) return 0.0;
        switch (item) {
        case "Coffee": return 2.50;
        case "Tea": return 2.00;
        case "Soft Drink": return 1.75;
        case "Water": return 2.95;
        case "Milk": return 1.50;
        case "Juice": return 2.50;
        default: return 0.0;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    
    
}
