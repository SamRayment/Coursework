package Views;

import Controller.AllReviewsController;
import Models.Location;
import Models.LocationService;
import Models.Review;
import Models.ReviewService;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;

public class AllReviews {

    static Stage parent;
    private int carParkId;

    public AllReviews(int carParkId, Stage theParent) {

        Stage stage = new Stage();
        this.carParkId = carParkId;
        parent = theParent;
        parent.hide();
        start(stage);

    }

    public void start(Stage stage) {


        VBox rootPane = new VBox();
        Scene scene = new Scene(rootPane, 240  , 368);

        stage.setTitle("Reviews Page");
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
        Label titleLabel = new Label("Reviews");
        titleLabel.prefWidthProperty().bind(rootPane.widthProperty());
        titleLabel.setStyle("-fx-text-fill: white;");
        titleLabel.setFont(new Font( 18));
        picAndTitlePane.getChildren().add(titleLabel);

        ScrollPane searchPane = new ScrollPane();
        Image starImage =  new Image("Resources/YellowStar.jpg");
        ArrayList<Review> carParkReview = ReviewService.selectById(carParkId, SearchResults.database);

        HBox starBox = new HBox();
        VBox totalReview = new VBox();
        for (Review r: carParkReview) {
            int numOfStars = r.getOutOfFive();
            for (int j = 0; j < numOfStars; j++) {
                ImageView star = new ImageView(starImage);
                starBox.getChildren().add(star);
            }
            totalReview.getChildren().add(starBox);
            Label explanation = new Label();
            explanation.setText(r.getExplanation());
            totalReview.getChildren().add(explanation);
        }

        searchPane.setContent(totalReview);
        VBox createReviewPane = new VBox();
        Hyperlink link = new Hyperlink();
        link.setText("Create Review");
        link.setOnAction((ActionEvent e) -> AllReviewsController.LoginOpen(stage));
        createReviewPane.getChildren().add(link);


        rootPane.getChildren().add(titlePane);
        rootPane.getChildren().add(createReviewPane);
        rootPane.getChildren().add(searchPane);
    }
}
