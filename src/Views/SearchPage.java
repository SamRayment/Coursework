package Views;

import Controller.SearchPageController;
import Models.*;
import Models.CarPark;
import com.sun.org.apache.xpath.internal.operations.String;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.Console;
import java.util.ArrayList;

import static Controller.SearchPageController.requirementsSelected;
import static Controller.SearchPageController.townSelected;


public class SearchPage extends Application {

    public static DatabaseConnection database;  //(Line V1) Public database connection
    public static CheckBox[] requirementsCheckboxes;  //(Line V2) Public checkbox called requirementsCheckboxes
    public static ChoiceBox<TownCounty> townCitySelector;  //(Line V3) Public choiceBox called townCitySelector

    public void start(Stage stage) throws Exception {

        database = new DatabaseConnection("Coursework.db"); //(Line V4) Creates the database connection and the database file


        VBox rootPane = new VBox(10);  //(Line V5) Creates Vbox called rootPane with the spacing of 10
        rootPane.setAlignment(Pos.CENTER);  //(Line V6) The rootPane aligns the Vbox at the centre of the scene

        Scene scene = new Scene(rootPane, 240, 368);  //(Line V7) Creates a new scene using the rootPane and sets the sizes

        stage.setTitle("Search Page");  //(Line V8) The title of the stage is set as "Search Page"
        stage.setScene(scene);  //(Line V9) The stage is set as the scene
        stage.show();  //(Line V10) Shows the stage

        stage.setResizable(false);  //(Line V11) The stage is set at a fixed size
        Label title = new Label("Parking Finder");  //(Line V12) A label named title is created with the text "Park Finder"
        title.setFont(new Font("Arial", 30));  //(Line V13) Styles the label, title, using the font as Arial and the size of the font as 30
        title.setAlignment(Pos.CENTER);  //(Line V14) This label is centred aligned

        Label searchLabel = new Label("Please select a town/city");  //(Line V15) A new label named searchLabel is created with the text
        // "Please select a town/city"

        ArrayList<TownCounty> townList = new ArrayList<>();  //(Line V16) A new ArrayList using the model TownCounty called townList is created
        TownCountyService.selectAll(townList, database);  //(Line V17) The selectAll method in the TownCountyService is called with the parameters the townList
        // and database
        townCitySelector = new ChoiceBox<>();  //(Line V18) Creates the choice box, townCitySelector
        townCitySelector.setItems(FXCollections.observableArrayList(townList));  //(Line V19) The values from townList are set as the values in
        // townCitySelector,// choicebox

        VBox checkBoxPane = new VBox(5);  //(Line V20) Creates a Vbox called checkBoxPane with a spacing of 5
        checkBoxPane.setPadding(new Insets(10));  //(Line V21) Sets the padding of checkBoxPane as 10
        requirementsCheckboxes = new CheckBox[4];  //(Line V22) Creates the requirementsCheckboxes with 4 check boxes
        requirementsCheckboxes[0] = new CheckBox("CCTV");  //(Line V23) Sets the first value of requirementsCheckboxes text as "CCTV"
        requirementsCheckboxes[1] = new CheckBox("Electric Charging"); //(Line V24) Sets the second value of requirementsCheckboxes text as "Electric Charging"
        requirementsCheckboxes[2] = new CheckBox("Disabled Parking"); //(Line V25) Sets the third value of requirementsCheckboxes text as "Disabled Parking"
        requirementsCheckboxes[3] = new CheckBox("Child Parking"); //(Line V26) Sets the fourth value of requirementsCheckboxes text as "Child Parking"
        checkBoxPane.getChildren().addAll(requirementsCheckboxes); //(Line V27) The requirementsCheckboxes is added to the checkBoxPane

        Button searchButton = new Button("Search"); //(Line V28) Creates a button called searchButton with the text "Search"
        searchButton.setPrefSize(200, 20); //(Line V29) Sets the size of the searchButton
        searchButton.setStyle("-fx-base: #4a86e8ff; -fx-text-fill: #FFFFFF; -fx-font-size: 24px;"); //(Line V30) sets the style of the searchButton

        searchButton.setOnAction((ActionEvent ae) -> SearchPageController.openNewStage(stage)); //(Line V31) The openNewStage method in the SearchPageController
        // is called for when the searchButton is clicked

        rootPane.getChildren().add(title);  //(Line V32) Adds the label, title, to the rootPane
        rootPane.getChildren().add(searchLabel);  //(Line V33) Adds the label, searchLabel, to the rootPane
        rootPane.getChildren().add(townCitySelector);  //(Line V34) Adds the choice box, townCitySelector, to the rootPane
        rootPane.getChildren().add(checkBoxPane);  //(Line V32) Adds the VBox, checkBoxPane, to the rootPane
        rootPane.getChildren().add(searchButton);  //(Line V32) Adds the VBox, searchButton, to the rootPane
        int carParkId = 6;
        java.lang.String review = "Good";
        int five = 5;
        Review r = new Review(0, carParkId, review, five);
        ReviewService.saveReview(r, database);
    }
}


