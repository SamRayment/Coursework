package Controller;


import Views.CarPark;
import javafx.stage.Stage;

public class SearchResultsController {

    public static void openNewStage(int carParkId, Stage parent) {
        CarPark newStage = new CarPark(carParkId, parent);
    }
}
