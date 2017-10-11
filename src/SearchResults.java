import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class SearchResults extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        VBox rootPane = new VBox();
        Scene scene = new Scene(rootPane, 240  , 368);

        stage.setTitle("Search Page");
        stage.setScene(scene);
        stage.show();

        stage.setResizable(false);

        VBox titlePane = new VBox(5);
        HBox picAndTitlePane = new HBox(5);

        Image image = new Image("arrow.jpg");
        ImageView iv1 = new ImageView();
        iv1.setFitWidth(36);
        iv1.setFitHeight(36);
        iv1.setImage(image);

        picAndTitlePane.getChildren().add(iv1);
        titlePane.prefWidthProperty().bind(rootPane.widthProperty());
        titlePane.prefHeightProperty().bind(rootPane.heightProperty().multiply(0.10));
        titlePane.setStyle("-fx-background-color: #4a86e8ff;");
        Label titleLabel = new Label("Search Results");
        titleLabel.prefWidthProperty().bind(rootPane.widthProperty());
        titleLabel.setStyle("-fx-text-fill: white;");
        titleLabel.setFont(new Font( 18));
        picAndTitlePane.getChildren().add(titleLabel);



        titlePane.getChildren().add(picAndTitlePane);

        ScrollPane searchPane = new ScrollPane();
        searchPane.setPrefViewportHeight(332);

        rootPane.getChildren().add(titlePane);
        rootPane.getChildren().add(searchPane);
    }
}
