package Controller;

import Models.Location;
import Models.TownCounty;
import Views.SearchResults;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;


import java.util.HashMap;

import static Controller.SearchResultsController.selectToLocate;
import static Views.SearchPage.requirementsCheckboxes;
import static Views.SearchPage.townCitySelector;

public class SearchPageController{

    public static String townSelected;
    public static HashMap<String, Boolean> requirementsSelected;

    public static void selectedLocation() {

        System.out.println(townSelected = townCitySelector.getValue().toString());

        requirementsSelected = new HashMap<>();

        for (CheckBox c : requirementsCheckboxes) {
            System.out.println(c.getText());
            requirementsSelected.put(c.getText(), c.isSelected());
        }
    }

    public static void openNewStage(Stage parent) {

        selectedLocation();
        SearchResults newStage = new SearchResults(parent);
        selectToLocate();
    }

}
