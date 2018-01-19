package Controller;

import Views.AllReviews;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;



public class CreateReviewPageController {
    public static void returnStage(int carParkId, Stage parent){
        AllReviews returnStage = new AllReviews(carParkId, parent);
    }

    public static void sendToSave(int carParkId, Stage stage, String review, int five){}
}
