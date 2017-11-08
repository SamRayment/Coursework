import Models.Location;
import Models.LocationService;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.sql.PreparedStatement;
import java.util.ArrayList;


public class SearchResults extends Application {
        public static DatabaseConnection database;

    @Override
    public void start(Stage stage) throws Exception {

        database = new DatabaseConnection("DatabaseCoursework.db");

        VBox rootPane = new VBox();
        Scene scene = new Scene(rootPane, 240  , 368);

        stage.setTitle("Search Page");
        stage.setScene(scene);
        stage.show();

        stage.setResizable(false);

        VBox titlePane = new VBox(5);
        HBox picAndTitlePane = new HBox(5);


        Image imageArrow = new Image(getClass().getResourceAsStream("arrow.jpg"));
        Button backButton = new Button();
        backButton.setGraphic(new ImageView(imageArrow));
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



        ScrollPane searchPane = new ScrollPane();
        searchPane.setPrefViewportHeight(332);

        rootPane.getChildren().add(titlePane);
        rootPane.getChildren().add(searchPane);
    }
    public static void doSelectAllTest(){
        ArrayList<LocationService> testList = new ArrayList<>();
        for ()

        )
    }
}
