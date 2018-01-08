package Controller;

import Models.CarPark;
import Models.CarParkService;
import Models.DatabaseConnection;
import Views.AllReviews;
import Views.SearchResults;
import javafx.stage.Stage;

import java.util.ArrayList;

public class CarParkController {
    public static void openNewStage(int carParkId, Stage parent) {
        AllReviews newStage = new AllReviews(carParkId, parent);
    }

    public static void returnStage(Stage parent) {
        SearchResults returnStage = new SearchResults(
                parent);
    }
}
