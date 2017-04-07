package ru.routeeditor.gui;

/**
 * Created by mark on 19.01.17.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class SampleGUI extends Application {


    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World!");

        Label helloworld = new Label("Hello world!");


        VBox root = new VBox();
        root.getChildren().addAll(
                helloworld
        );

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}

