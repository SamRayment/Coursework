package Controller;

import Views.AllReviews;
import Views.LoginPage;
import javafx.stage.Stage;

public class AllReviewsController {
    public static void LoginOpen(int carParkId, Stage parent) {
        LoginPage newStage = new LoginPage(carParkId, parent);
    }

    public static void returnStage(int carParkId, Stage parent){
        AllReviews returnStage = new AllReviews(carParkId, parent);
    }
}
