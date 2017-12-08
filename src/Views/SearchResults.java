package Views;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class SearchResults {

        static Stage parent;

        public SearchResults(Stage theParent) {

            Stage stage = new Stage();
            parent = theParent;
            parent.hide();
            start(stage);

        }

    public void start(Stage stage) {


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


        Pane searchPane = new Pane();
        Hyperlink link = new Hyperlink();
        link.setText("click here to move onto next stage");
        link.setOnAction((ActionEvent e) -> openNewStage(stage));
        searchPane.getChildren().add(link);

        rootPane.getChildren().add(titlePane);
        rootPane.getChildren().add(searchPane);
    }
    public static void openNewStage(Stage parent) {
        CarPark newStage = new CarPark(parent);
    }
}
