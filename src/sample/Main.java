package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.awt.*;



public class Main extends Application {

        @Override
        public void start(Stage stage) throws Exception {

            HBox rootPane = new HBox(10);

            Scene scene = new Scene(rootPane, 240  , 368);

            stage.setTitle("Search Page");
            stage.setScene(scene);
            stage.show();

            stage.setResizable(false);
            Label title = new Label("Parking Finder");
            title.setFont(new Font("Arial", 30));
            title.setAlignment(Pos.CENTER);

            CheckBox [] myCheckBox = new CheckBox[4];
            myCheckBox[0] = new CheckBox("CCTV");
            myCheckBox[1] = new CheckBox("Electric Charging");
            myCheckBox[2] = new CheckBox("Disabled Parking");
            myCheckBox[3] = new CheckBox("Child Parking");


            rootPane.getChildren().add(title);
            rootPane.getChildren().addAll(myCheckBox);
        }

        public static void main(String[] args) {
            launch(args);
        }
    }

