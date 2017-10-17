import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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

        HBox picAndTitlePane = new HBox(20);
        VBox loginPane =new VBox(20);

        loginPane.setPadding(new Insets(20));

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

        Image imageArrow = new Image(getClass().getResourceAsStream("arrow.jpg"));
        Button backButton = new Button();
        backButton.setGraphic(new ImageView(imageArrow));
        picAndTitlePane.getChildren().add(backButton);

        Label titleLabel = new Label ("Login");
        titleLabel.setStyle("-fx-text-fill: white;");
        titleLabel.setFont(new Font( 18));
        picAndTitlePane.getChildren().add(titleLabel);


        Label title = new Label("Please sign in to enter review");
        title.setFont(new Font("Arial", 14));

        TextField usernameTextfield = new TextField();
        usernameTextfield.setPrefWidth(100);
        usernameTextfield.setPromptText("Please enter username");
        PasswordField passwordfield = new PasswordField();
        passwordfield.setPromptText("Please enter password");



        Button searchButton = new Button("Login");
        searchButton.setStyle("-fx-base: #4a86e8ff; -fx-text-fill: #FFFFFF; -fx-font-size: 24px; -fx-max-width: 150px; -fx-max-height: 5px;");

        titlePane.getChildren().add(picAndTitlePane);
        rootPane.getChildren().add(titlePane);
        loginPane.getChildren().add(title);
        loginPane.getChildren().add(usernameTextfield);
        loginPane.getChildren().add(passwordfield);
        loginPane.getChildren().add(searchButton);
        rootPane.getChildren().add(loginPane);
    }

    public static void main(String[] args) {
        launch(args);
    }
}



