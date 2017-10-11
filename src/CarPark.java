import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CarPark extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox rootPane = new VBox(10);
        Scene scene = new Scene(rootPane, 240  , 368);

        stage.setTitle("Car Park");
        stage.setScene(scene);
        stage.show();

        stage.setResizable(false);

        VBox titlePane = new VBox(5);
        HBox picAndTitlePane = new HBox(5);

        Image image = new Image("arrow.jpg");
        ImageView iv1 = new ImageView();
        iv1.setFitWidth(36);
        iv1.setFitHeight(36);
        iv1.setImage(image);
        picAndTitlePane.getChildren().add(iv1);


            }






        }
}