package Controller;

import Views.SearchResults;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;


import static Views.SearchPage.requirementsCheckboxes;
import static Views.SearchPage.townCitySelector;

public class SearchPageController{


    public static void selectedLocation(){

       System.out.println(townCitySelector.getValue());

        for (CheckBox c : requirementsCheckboxes) {
            if (c.isSelected()) {
                System.out.println(c.getText());

            }

        }
    }

    public static void openNewStage(Stage parent) {

        selectedLocation();

        SearchResults newStage = new SearchResults(parent);
    }

}
