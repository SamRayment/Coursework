package Views;

import Controller.SignUpPageController;
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

public class SignUpPage {


    static Stage parent;
    private int carParkId;
    public SignUpPage(int carParkId, Stage theParent) {

        Stage stage = new Stage();
        this.carParkId = carParkId;
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
        stage.setTitle("Sign up Page");
        stage.setScene(scene);
        stage.show();

        stage.setTitle("Sign up Page");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

        Image imageArrow = new Image("Resources/arrow.jpg");
        Button backButton = new Button();
        backButton.setGraphic(new ImageView(imageArrow));
        backButton.setGraphic(new ImageView(imageArrow));
        backButton.setOnAction((ActionEvent e) -> {
            parent.show();
        });
        picAndTitlePane.getChildren().add(backButton);

        Label titleLabel = new Label("Sign up");
        titleLabel.setStyle("-fx-text-fill: white;");
        titleLabel.setFont(new Font(18));

        picAndTitlePane.getChildren().add(titleLabel);


        Label title = new Label("Please create a username and password");
        title.setFont(new Font("Arial", 10));

        TextField createUsernameTextfield = new TextField();
        PasswordField createPasswordfield = new PasswordField();

        createUsernameTextfield.setPromptText("Please enter username");
        createUsernameTextfield.setPrefWidth(100);
        createPasswordfield.setPromptText("Please enter password");



        Button signButton = new Button("Enter");
        signButton.setStyle("-fx-base: #4a86e8ff; -fx-text-fill: #FFFFFF; -fx-font-size: 24px; -fx-max-width: 150px; -fx-max-height: 5px;");
        signButton.setOnAction((ActionEvent ae) -> SignUpPageController.turnToHash(createUsernameTextfield, createPasswordfield, stage, carParkId));

        titlePane.getChildren().add(picAndTitlePane);
        rootPane.getChildren().add(titlePane);
        loginPane.getChildren().add(title);
        loginPane.getChildren().add(createUsernameTextfield);
        loginPane.getChildren().add(createPasswordfield);
        loginPane.getChildren().add(signButton);
        rootPane.getChildren().add(loginPane);
    }
}



