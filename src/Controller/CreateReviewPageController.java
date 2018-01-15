package Controller;

import Views.AllReviews;
import javafx.stage.Stage;

public class CreateReviewPageController {
    public static void returnStage(int carParkId, Stage parent){
        AllReviews returnStage = new AllReviews(carParkId, parent);
    }
}
