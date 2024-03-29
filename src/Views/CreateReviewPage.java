package Views;

import Controller.CreateReviewPageController;
import Controller.LoginPageController;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CreateReviewPage {


    static Stage parent;
    private int carParkId;

    public CreateReviewPage(int carParkId, Stage theParent) {
        Stage stage = new Stage();
        parent = theParent;
        this.carParkId = carParkId;
        parent.hide();
        start(stage);

    }
    public void start(Stage stage) {

        VBox rootPane = new VBox(10);
        Scene scene = new Scene(rootPane, 240, 368);

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
            LoginPageController.returnStage(carParkId, stage);
        });
        picAndTitlePane.getChildren().add(backButton);


        titlePane.getChildren().add(picAndTitlePane);
        titlePane.prefWidthProperty().bind(rootPane.widthProperty());
        titlePane.prefHeightProperty().bind(rootPane.heightProperty().multiply(0.10));
        titlePane.setStyle("-fx-background-color: #4a86e8ff;");
        Label titleLabel = new Label("Search Results");
        titleLabel.prefWidthProperty().bind(rootPane.widthProperty());
        titleLabel.setStyle("-fx-text-fill: white;");
        titleLabel.setFont(new Font(18));
        picAndTitlePane.getChildren().add(titleLabel);

        HBox reviewStarPane = new HBox(10);

        Boolean firstStarClicked = false;
        Image greyStar = new Image("Resources/star.jpg");
        Image yellowStar = new Image("Resources/YellowStar.jpg");
        Button firstStar = new Button();
        firstStar.setGraphic(new ImageView(greyStar));
        firstStar.setOnAction((ActionEvent e) -> {
            firstStar.setGraphic(new ImageView(yellowStar));
      //      firstStarClicked = true;
        });
        reviewStarPane.getChildren().add(firstStar);

        Button secondStar = new Button();
        secondStar.setGraphic(new ImageView(greyStar));
        secondStar.setOnAction((ActionEvent e) -> {
            secondStar.setGraphic(new ImageView(yellowStar));
        });
        reviewStarPane.getChildren().add(secondStar);

        Button thirdStar = new Button();
        thirdStar.setGraphic(new ImageView(greyStar));
        thirdStar.setOnAction((ActionEvent e) -> {
            thirdStar.setGraphic(new ImageView(yellowStar));
        });
        reviewStarPane.getChildren().add(thirdStar);

        Button fourthStar = new Button();
        fourthStar.setGraphic(new ImageView(greyStar));
        fourthStar.setOnAction((ActionEvent e) -> {
            fourthStar.setGraphic(new ImageView(yellowStar));
        });
        reviewStarPane.getChildren().add(fourthStar);

        Button fifthStar = new Button();
        fifthStar.setGraphic(new ImageView(greyStar));
        fifthStar.setOnAction((ActionEvent e) -> {
            fifthStar.setGraphic(new ImageView(yellowStar));
        });
        reviewStarPane.getChildren().add(fifthStar);

        TextArea review = new TextArea();

        VBox buttonPane = new VBox();

        Button sendButton = new Button("Send");
        sendButton.setPrefSize(200, 20);
        sendButton.setStyle("-fx-base: #4a86e8ff; -fx-text-fill: #FFFFFF; -fx-font-size: 24px;");
      //  sendButton.setOnAction((ActionEvent e) -> CreateReviewPageController.sendToSave(carParkId, stage, review));
        buttonPane.getChildren().add(sendButton);

        buttonPane.setAlignment(Pos.CENTER);

        rootPane.getChildren().add(titlePane);
        rootPane.getChildren().add(reviewStarPane);
        rootPane.getChildren().add(review);
        rootPane.getChildren().add(buttonPane);
    }
}