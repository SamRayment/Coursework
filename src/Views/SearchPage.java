package Views;

import Controller.SearchPageController;
import Models.*;
import Models.CarPark;
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

    public static DatabaseConnection database;
    public static CheckBox[] requirementsCheckboxes;
    public static ChoiceBox<TownCounty> townCitySelector;

    @Override
    public void start(Stage stage) throws Exception {

        database = new DatabaseConnection("Coursework.db");


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

        ArrayList<TownCounty> townList = new ArrayList<>();
        TownCountyService.selectAll(townList, database);
        townCitySelector = new ChoiceBox<>();
        townCitySelector.setItems(FXCollections.observableArrayList(townList));

        VBox checkBoxBox = new VBox(5);
        checkBoxBox.setPadding(new Insets(10));
        requirementsCheckboxes = new CheckBox[4];
        requirementsCheckboxes[0] = new CheckBox("CCTV");
        requirementsCheckboxes[1] = new CheckBox("Electric Charging");
        requirementsCheckboxes[2] = new CheckBox("Disabled Parking");
        requirementsCheckboxes[3] = new CheckBox("Child Parking");
        checkBoxBox.getChildren().addAll(requirementsCheckboxes);

        Button searchButton = new Button("Search");
        searchButton.setPrefSize(200, 20);
        searchButton.setStyle("-fx-base: #4a86e8ff; -fx-text-fill: #FFFFFF; -fx-font-size: 24px;");

        searchButton.setOnAction((ActionEvent ae) -> SearchPageController.openNewStage(stage));

        ArrayList<TownCounty> testList = new ArrayList<>();
        TownCountyService.selectAll(testList, database);
        for (TownCounty c: testList) {
            System.out.println(c);
        }
        int carParkTestId = 3;

        ArrayList<CarPark> carParkTest = new ArrayList<>();
        CarParkService.selectById(carParkTestId, database);
        for (CarPark c: carParkTest) {
            System.out.println(c);
        }

        String usernameTest = "JoeBloggs";
        String passwordTest = "CF97BE4E7084700EE3B00CE7504C7AA5";
        MembershipService.selectMemberById(usernameTest, passwordTest, database);

        int carParkId = 8;
        int MembershipId = 5;
        ReviewService.selectById(carParkId, MembershipId, database);

        TimetableService.selectById(carParkId, database);




        rootPane.getChildren().add(title);
        rootPane.getChildren().add(searchLabel);
        rootPane.getChildren().add(townCitySelector);
        rootPane.getChildren().add(checkBoxBox);
        rootPane.getChildren().add(searchButton);



    }
}




