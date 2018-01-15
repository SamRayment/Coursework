package Controller;


import Views.CarPark;
import Views.SearchPage;
import javafx.stage.Stage;


public class SearchResultsController {

    public static void openNewStage(int carParkId, Stage parent) {
        CarPark newStage = new CarPark(carParkId, parent);
    }

    public static void returnStage(Stage parent){
        parent.show();
    }
}

