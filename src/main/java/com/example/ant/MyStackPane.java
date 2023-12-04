package com.example.ant;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import static javafx.geometry.Pos.TOP_RIGHT;

public class MyStackPane extends StackPane {
    MyAnt myAnt;
    HealthBar healthBar;
    double speed = 1.0;

    MyStackPane() {
        myAnt = new MyAnt();
        healthBar=new HealthBar(myAnt);
        this.setMinWidth(420);
        this.setMinHeight(420);
        this.getChildren().addAll(myAnt,healthBar);
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(20), event -> {
                    double currentAngle = myAnt.getCurrentAngle()-90;
                    myAnt.setHP(-0.1);
                    healthBar.upadte();
                    System.out.println(myAnt.getHP());
                    double newX = myAnt.getLayoutX() + speed * Math.cos(Math.toRadians(currentAngle));
                    double newY = myAnt.getLayoutY() + speed * Math.sin(Math.toRadians(currentAngle));
                        myAnt.moveAntX(newX);
                        myAnt.moveAntY(newY);
                })
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }


    public MyAnt getMyAnt() {
        return myAnt;
    }
}
