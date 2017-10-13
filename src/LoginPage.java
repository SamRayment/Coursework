import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoginPage extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox rootPane = new VBox(10);
        VBox titlePane = new VBox();
        titlePane.setStyle("-fx-background-color: #4a86e8ff;");

        HBox picAndTitlePane = new HBox(5);
        VBox loginPane =new VBox();
        loginPane.setAlignment(Pos.CENTER);

        stage.setResizable(false);

        Scene scene = new Scene(rootPane, 240  , 368);
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();

        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

        Image image = new Image("arrow.jpg");
        ImageView iv1 = new ImageView();
        iv1.setFitWidth(36);
        iv1.setFitHeight(36);
        iv1.setImage(image);

        Label titleLabel = new Label ("Login");
        titleLabel.setStyle("-fx-text-fill: white;");
        titleLabel.setFont(new Font( 18));
        picAndTitlePane.getChildren().add(iv1);
        picAndTitlePane.getChildren().add(titleLabel);


        Label title = new Label("Please sign in to enter review");
        title.setFont(new Font("Arial", 18));





        Button searchButton = new Button("Login");
        searchButton.setPrefSize(200, 50);
        searchButton.setStyle("-fx-base: #4a86e8ff; -fx-text-fill: #FFFFFF; -fx-font-size: 24px;");

        titlePane.getChildren().add(picAndTitlePane);
        rootPane.getChildren().add(titlePane);
        rootPane.getChildren().add(title);
        rootPane.getChildren().add(searchButton);
    }

    public static void main(String[] args) {
        launch(args);
    }
}



