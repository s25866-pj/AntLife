package com.example.ant;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AntApplication extends Application {
    @Override
    public void start(Stage stage){
//        MyScene myScene = new MyScene();
        stage.setScene(new MyScene());
        stage.setTitle("Hello!");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}