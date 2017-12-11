package Views;

import Models.*;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;


public class SearchResults {

        static Stage parent;

        public static DatabaseConnection database;
        public SearchResults(Stage theParent) {

            Stage stage = new Stage();
            parent = theParent;
            parent.hide();
            start(stage);

        }

    public void start(Stage stage) {

       database = new DatabaseConnection("Coursework.db");


        TownCounty selectedTown = SearchPage.townCitySelector.getSelectionModel().getSelectedItem();

        VBox rootPane = new VBox();
        Scene scene = new Scene(rootPane, 240  , 368);

        stage.setTitle("Search Page");
        stage.setScene(scene);
        stage.show();

        stage.setResizable(false);

        VBox titlePane = new VBox(5);
        HBox picAndTitlePane = new HBox(5);


        Image imageArrow = new Image("Resources/arrow.jpg");
        Button backButton = new Button();
        backButton.setGraphic(new ImageView(imageArrow));
        backButton.setOnAction((ActionEvent e) -> {
            parent.show();
        });
        picAndTitlePane.getChildren().add(backButton);

        titlePane.getChildren().add(picAndTitlePane);
        titlePane.prefWidthProperty().bind(rootPane.widthProperty());
        titlePane.prefHeightProperty().bind(rootPane.heightProperty().multiply(0.10));
        titlePane.setStyle("-fx-background-color: #4a86e8ff;");
        Label titleLabel = new Label("Search Results");
        titleLabel.prefWidthProperty().bind(rootPane.widthProperty());
        titleLabel.setStyle("-fx-text-fill: white;");
        titleLabel.setFont(new Font( 18));
        picAndTitlePane.getChildren().add(titleLabel);

        String carPark;
        ScrollPane searchScrollPane = new ScrollPane();

        VBox searchPane = new VBox(20);
        searchPane.setPadding(new Insets(20));

        Label searchTitle = new Label("Results for " + selectedTown.getTown());
        searchPane.getChildren().add(searchTitle);

        Image starImage =  new Image("Resources/YellowStar.jpg");

        for (int i = 0; i < 10; i++) {
            HBox resultBox = new HBox();

            Rectangle colouredThing = new Rectangle();
            colouredThing.setHeight(50);
            colouredThing.setWidth(10);
            colouredThing.setFill(Color.GREEN);
            resultBox.getChildren().add(colouredThing);

            VBox rightHandSide = new VBox();

            Label label = new Label("Wooo! A result!");
            rightHandSide.getChildren().add(label);

            ArrayList<Location> carParkList = new ArrayList<>();
            LocationService.selectToLocate(database);

            Hyperlink link = new Hyperlink();
            link.setText("Go to result number " + carParkList);
            link.setOnAction((ActionEvent e) -> openNewStage(stage));
            rightHandSide.getChildren().add(link);

            HBox starBox = new HBox();
            for (int j = 0; j < 5; j++) {
                ImageView star = new ImageView(starImage);
                starBox.getChildren().add(star);
            }

            rightHandSide.getChildren().add(starBox);

            resultBox.getChildren().add(rightHandSide);
            searchPane.getChildren().add(resultBox);
        }

        ArrayList<Location> carParkList = new ArrayList<>();
        LocationService.selectToLocate(database);


        rootPane.getChildren().add(titlePane);
        searchScrollPane.setContent(searchPane);
        rootPane.getChildren().add(searchScrollPane);
    }

    public static void openNewStage(Stage parent) {
        CarPark newStage = new CarPark(parent);
    }
}
