package com.example.ant;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
public class MyAnt extends Pane {
    ImageView antImageView;
    double rotateAngle = 0;
    double HP = 100;
    MyAnt(){
        Image antImage = new Image("file:/home/damian/Desktop/java/korki/Calculator/Ant/src/main/java/com/example/ant/Ant.png");
        antImageView=new ImageView(antImage);
        antImageView.setFitWidth(15);
        antImageView.setFitHeight(16);
        antImageView.setLayoutX(200);
        antImageView.setLayoutY(100);
        getChildren().add(antImageView);
    }
    public void moveAntX(double i){
        antImageView.setLayoutX(antImageView.getLayoutX()+i);
    }
    public void moveAntY(double i){
        antImageView.setLayoutY(antImageView.getLayoutY()+i);
    }
    public void rotate(){
        antImageView.setRotate(rotateAngle);
    }
    public double getCurrentAngle() {
        return rotateAngle;
    }

    public void setCurrentAngle(double angle) {
        rotate();
        this.rotateAngle = angle;
    }

    public double getHP() {
        return HP;
    }
    public void setHP(double hpChange){
        this.HP=this.HP+hpChange;
    }
}
