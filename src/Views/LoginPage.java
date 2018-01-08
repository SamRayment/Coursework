package Views;


import Controller.LoginPageController;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class LoginPage {

    static Stage parent;

    public LoginPage(Stage theParent) {

        Stage stage = new Stage();
        parent = theParent;
        parent.hide();
        start(stage);

    }

    public void start(Stage stage) {
        VBox rootPane = new VBox(10);
        VBox titlePane = new VBox();
        titlePane.setStyle("-fx-background-color: #4a86e8ff;");

        HBox picAndTitlePane = new HBox(20);
        VBox loginPane = new VBox(20);

        loginPane.setPadding(new Insets(20));

        loginPane.setAlignment(Pos.CENTER);

        stage.setResizable(false);

        Scene scene = new Scene(rootPane, 240, 368);
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();

        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

        Image imageArrow = new Image("Resources/arrow.jpg");
        Button backButton = new Button();
        backButton.setGraphic(new ImageView(imageArrow));
        backButton.setOnAction((ActionEvent e) -> returnStage(stage));
        picAndTitlePane.getChildren().add(backButton);

        Label titleLabel = new Label("Login");
        titleLabel.setStyle("-fx-text-fill: white;");
        titleLabel.setFont(new Font(18));
        picAndTitlePane.getChildren().add(titleLabel);


        Label title = new Label("Please sign in to enter review");
        title.setFont(new Font("Arial", 14));

        TextField usernameTextfield = new TextField();
        PasswordField passwordfield = new PasswordField();
        usernameTextfield.setPrefWidth(100);
        usernameTextfield.setPromptText("Please enter username");
        passwordfield.setPromptText("Please enter password");


        Button searchButton = new Button("Login");
        searchButton.setStyle("-fx-base: #4a86e8ff; -fx-text-fill: #FFFFFF; -fx-font-size: 24px; -fx-max-width: 150px; -fx-max-height: 5px;");
        searchButton.setOnAction((ActionEvent ae) -> LoginPageController.turnToHash(usernameTextfield, passwordfield, stage));

        Hyperlink link = new Hyperlink();
        link.setText("Click here to sign up");
        link.setOnAction((ActionEvent e) -> linkToSignUp(stage));

        titlePane.getChildren().add(picAndTitlePane);
        rootPane.getChildren().add(titlePane);
        loginPane.getChildren().add(title);
        loginPane.getChildren().add(usernameTextfield);
        loginPane.getChildren().add(passwordfield);
        loginPane.getChildren().add(searchButton);
        loginPane.getChildren().add(link);
        rootPane.getChildren().add(loginPane);
    }

    public static void returnStage(Stage parent){
        //CarPark returnStage = new CarPark(parent);
    }

    public static void openNewStage(Stage parent) {
        CreateReviewPage newStage = new CreateReviewPage(parent);
    }

    public static void linkToSignUp(Stage parent) {SignUpPage newStage = new SignUpPage(parent);}
}



