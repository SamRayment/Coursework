package Controller;

import Views.SearchResults;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;


import java.util.HashMap;

import static Views.SearchPage.requirementsCheckboxes;
import static Views.SearchPage.townCitySelector;

public class SearchPageController{

    public static String townSelected; // (Line L18) A public string variable called townSelected is created
    public static HashMap<String, Boolean> requirementsSelected; /* (Line L19) A public hash map with the data types of a
   string then a boolean  called requirementsSelected*/

    public static void selectedLocation() {

        townSelected = townCitySelector.getValue().toString(); /* (Line L24) The value of townCitySelector is stored as
        the value of townSelected*/

        requirementsSelected = new HashMap<>(); // (Line L27) requirementsSelected is declared as a new hash map

        for (CheckBox c : requirementsCheckboxes) { // (Line L29) An enhanced for loop is created where it goes through each value of the
            // check box requirementsCheckboxes
            requirementsSelected.put(c.getText(), c.isSelected());// (Line L30) The values from requirementsCheckboxes are added to the
            // hash map requirementsSelected
        }
    }

    public static void openNewStage(Stage parent) { // (Line L34) openNewStage is the first object of the class accessed when the button is clicked on SearchPage

        selectedLocation(); // (Line L36) Sends the program to the object selectedLocation
        SearchResults newStage = new SearchResults(parent); //(Line L37) Opens up the next stage which is the SearchResults view
    }

}
