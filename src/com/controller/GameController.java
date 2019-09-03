package com.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class GameController {
    public TextField winTextField;
    public TextField loseTextField;
    public TextField drawTextField;
    public ImageView userImage;
    public ImageView computerImage;
    public int compu, userch;
    public int totalwin,totaldraw,totallose;

    public void scissorAction(ActionEvent actionEvent) {
        Random rnd = new Random();
        compu = rnd.nextInt(3);

        Image img = new Image("image/scissor.png");
        userImage.setImage(img);


        if (compu == 0) {
            Image img1 = new Image("image/scissor.png");
            computerImage.setImage(img1);
            totaldraw += 1;
            drawTextField.setText(Integer.toString(totaldraw));
        } else if (compu == 1) {
            Image img1 = new Image("image/paper.png");
            computerImage.setImage(img1);
            totalwin += 1;
            winTextField.setText(Integer.toString(totalwin));
        } else {
            Image img1 = new Image("image/rock.jfif");
            computerImage.setImage(img1);
            totallose += 1;
            loseTextField.setText(Integer.toString(totallose));
        }

    }

    public void rockAction(ActionEvent actionEvent) {


        Random rnd = new Random();
        compu = rnd.nextInt(3);


        Image img = new Image("image/rock.jfif");
        userImage.setImage(img);

        if (compu == 0) {
            Image img1 = new Image("image/scissor.png");
            computerImage.setImage(img1);
            totalwin += 1;
            winTextField.setText(Integer.toString(totalwin));
        } else if (compu == 1) {
            Image img1 = new Image("image/paper.png");
            computerImage.setImage(img1);
            totallose += 1;
            loseTextField.setText(Integer.toString(totallose));
        } else {
            Image img1 = new Image("image/rock.jfif");
            computerImage.setImage(img1);
            totaldraw += 1;
            drawTextField.setText(Integer.toString(totaldraw));
        }


    }

    public void paperAction(ActionEvent actionEvent) {


        Random rnd = new Random();
        compu = rnd.nextInt(3);


        Image img = new Image("image/paper.png");
        userImage.setImage(img);

        if (compu == 0) {
            Image img1 = new Image("image/scissor.png");
            computerImage.setImage(img1);
            totallose += 1;
            loseTextField.setText(Integer.toString(totallose));
        } else if (compu == 1) {
            Image img1 = new Image("image/paper.png");
            computerImage.setImage(img1);
            totaldraw += 1;
            drawTextField.setText(Integer.toString(totaldraw));
        } else {
            Image img1 = new Image("image/rock.jfif");
            computerImage.setImage(img1);
            totalwin += 1;
            winTextField.setText(Integer.toString(totalwin));

        }




    }

    public void exitAction(ActionEvent actionEvent) {
        Platform.exit();
    }
}
