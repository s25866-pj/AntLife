package com.example.ant;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class HealthBar extends StackPane {
    double lenght;
    MyAnt myAnt;
    HealthBar(MyAnt myAnt){
        this.myAnt=myAnt;
        lenght =myAnt.getHP();
        Rectangle HPBar = new Rectangle(lenght*2,20);
        System.out.println(myAnt.getHP());
        if(lenght>75){
            HPBar.setFill(Color.GREEN);
        }else if(lenght<=75&&lenght>50){
            HPBar.setFill(Color.YELLOW);
        }else if(lenght<=50&&lenght>25){
            HPBar.setFill(Color.ORANGE);
        }else{
            HPBar.setFill(Color.RED);
        }
        StackPane.setAlignment(HPBar, Pos.TOP_LEFT);
        StackPane.setMargin(HPBar, new Insets(10, 0, 0, 10));
        this.getChildren().add(HPBar);
    }

    public void upadte() {
        lenght=myAnt.getHP();
    }
}

