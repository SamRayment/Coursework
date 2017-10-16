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

public class SignUpPage extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox rootPane = new VBox(10);
        VBox titlePane = new VBox();
        titlePane.setStyle("-fx-background-color: #4a86e8ff;");

        HBox picAndTitlePane = new HBox(20);
        VBox loginPane =new VBox(20);
        loginPane.setAlignment(Pos.CENTER);

        stage.setResizable(false);

        Scene scene = new Scene(rootPane, 240  , 368);
        stage.setTitle("Sign up Page");
        stage.setScene(scene);
        stage.show();

        stage.setTitle("Sign up Page");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

        Image image = new Image("arrow.jpg");
        ImageView iv1 = new ImageView();
        iv1.setFitWidth(36);
        iv1.setFitHeight(36);
        iv1.setImage(image);

        Label titleLabel = new Label ("Sign up");
        titleLabel.setStyle("-fx-text-fill: white;");
        titleLabel.setFont(new Font( 18));
        picAndTitlePane.getChildren().add(iv1);
        picAndTitlePane.getChildren().add(titleLabel);


        Label title = new Label("Please create a username and password");
        title.setFont(new Font("Arial", 12));

        TextField usernameTextfield = new TextField("Please enter username");
        usernameTextfield.setPrefWidth(100);
        usernameTextfield.setPadding(new Insets(10));
        PasswordField passwordfield = new PasswordField();
        passwordfield.setPromptText("Please enter password");



        Button searchButton = new Button("Enter");
        searchButton.setStyle("-fx-base: #4a86e8ff; -fx-text-fill: #FFFFFF; -fx-font-size: 24px; -fx-max-width: 150px; -fx-max-height: 5px;");

        titlePane.getChildren().add(picAndTitlePane);
        loginPane.getChildren().add(titlePane);
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



