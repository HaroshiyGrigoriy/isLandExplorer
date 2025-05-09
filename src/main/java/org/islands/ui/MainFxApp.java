package org.islands.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class MainFxApp extends Application {
    @Override
    public void start(Stage stage) {
        Button button = new Button("Привет, JavaFX!");
        button.setOnAction(e -> button.setText("Нажато"));

        StackPane root = new StackPane(button);
        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Тестово окно");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
