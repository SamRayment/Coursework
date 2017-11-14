import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;




public class SearchPage extends Application {

    @Override
    public void start(Stage stage) throws Exception {


        VBox rootPane = new VBox(10);
        rootPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(rootPane, 240, 368);

        stage.setTitle("Search Page");
        stage.setScene(scene);
        stage.show();

        stage.setResizable(false);
        Label title = new Label("Parking Finder");
        title.setFont(new Font("Arial", 30));
        title.setAlignment(Pos.CENTER);

        Label searchLabel = new Label("Please select a town/city");

        ChoiceBox townCitySelector = new ChoiceBox();

        VBox checkBoxBox = new VBox(5);
        checkBoxBox.setPadding(new Insets(10));
        CheckBox[] myCheckBox = new CheckBox[4];
        myCheckBox[0] = new CheckBox("CCTV");
        myCheckBox[1] = new CheckBox("Electric Charging");
        myCheckBox[2] = new CheckBox("Disabled Parking");
        myCheckBox[3] = new CheckBox("Child Parking");
        checkBoxBox.getChildren().addAll(myCheckBox);

        Button searchButton = new Button("Search");
        searchButton.setPrefSize(200, 20);
        searchButton.setStyle("-fx-base: #4a86e8ff; -fx-text-fill: #FFFFFF; -fx-font-size: 24px;");

        searchButton.setOnAction((ActionEvent ae) -> openNewStage(stage));


        rootPane.getChildren().add(title);
        rootPane.getChildren().add(searchLabel);
        rootPane.getChildren().add(townCitySelector);
        rootPane.getChildren().add(checkBoxBox);
        rootPane.getChildren().add(searchButton);
    }

    public static void openNewStage(Stage parent) {
        SearchResults newStage = new SearchResults(parent);
    }

}

