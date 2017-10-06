package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static javafx.geometry.Pos.CENTER;



public class SearchResults extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Pane rootPane = new Pane();
        Scene scene = new Scene(rootPane, 240  , 368);

        stage.setTitle("Search Page");
        stage.setScene(scene);
        stage.show();

        stage.setResizable(false);

        VBox titlePane = new VBox(5);
        titlePane.prefWidthProperty().bind(rootPane.widthProperty());
        titlePane.prefHeightProperty().bind(rootPane.heightProperty().multiply(0.10));
        titlePane.setStyle("-fx-background-color: #4a86e8ff;");
        Label titleLabel = new Label("Search Results");
        titleLabel.setStyle("-fx-text-fill: #FFFFFF; -fx-font-size: 18px;");
        titleLabel.setAlignment(CENTER);

        titlePane.getChildren().add(titleLabel);

        rootPane.getChildren().add(titlePane);
    }
}
