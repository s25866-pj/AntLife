package com.example.ant;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class MyScene extends Scene {
    MyAnt myAnt;
    MyScene(){
        super(new MyStackPane());
        myAnt = ((MyStackPane) getRoot()).getMyAnt();
        this.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                System.out.println("pressed " + keyEvent.getCode());
                if (keyEvent.getCode() == KeyCode.A) {
                    myAnt.setCurrentAngle(myAnt.getCurrentAngle()-5); // Obróć w lewo
                } else if (keyEvent.getCode() == KeyCode.D) {
                    myAnt.setCurrentAngle(myAnt.getCurrentAngle()+5);
                }
            }
        });
    }

}
