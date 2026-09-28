/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5_roshan;

import javafx.application.Application;
import javafx.scene.control.*;
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
    }
    
    public static void main(String[] args) {
        launch(args);
    }

    
    
}
