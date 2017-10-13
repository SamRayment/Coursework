import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
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
        VBox rootPane = new VBox(5);
        Scene scene = new Scene(rootPane, 280, 448);

        stage.setTitle("Car Park");
        stage.setScene(scene);
        stage.show();

        stage.setResizable(false);


        VBox titlePane = new VBox(5);
        HBox picAndTitlePane = new HBox(5);

        titlePane.setStyle("-fx-background-color: #4a86e8ff;");

        Image image = new Image("arrow.jpg");
        ImageView iv1 = new ImageView();
        iv1.setFitWidth(36);
        iv1.setFitHeight(36);
        iv1.setImage(image);
        picAndTitlePane.getChildren().add(iv1);

        Label titleExample = new Label("(Title would be here)");
        titleExample.setStyle("-fx-text-fill: white;");
        titleExample.setFont(new Font( 18));
        picAndTitlePane.getChildren().add(titleExample);

        HBox reviewPane = new HBox(15);
        Label ProblemExample = new Label("(Status of car park here)");
        reviewPane.getChildren().add(ProblemExample);

        Hyperlink reviewLink = new Hyperlink();
        reviewLink.setText("View Reviews");
        reviewLink.setOnAction((ActionEvent e) -> {
            System.out.println("This link is clicked");
        });
        reviewPane.getChildren().add(reviewLink);

        HBox picPane = new HBox(10);
        Label picExample = new Label ("(Pictures of features would go here)");
        picPane.getChildren().add(picExample);

        titlePane.getChildren().add(picAndTitlePane);


        VBox addressPane = new VBox();
        Label roadExample = new Label("(Road)");
        Label town = new Label ("(Town)");
        Label county = new Label ("(County)");
        Label postcode = new Label ("(Postcode)");

        addressPane.getChildren().add(roadExample);
        addressPane.getChildren().add(town);
        addressPane.getChildren().add(county);
        addressPane.getChildren().add(postcode);

        VBox additionalInfoPane = new VBox();
        Label spacesLabel = new Label("Number of Space:");
        Label payPhoneLane = new Label ("Pay-by-phone: ");
        additionalInfoPane.getChildren().add(spacesLabel);
        additionalInfoPane.getChildren().add(payPhoneLane);

        VBox timesPane = new VBox();
        Label timesLabel = new Label("Times open");
        timesLabel.setFont(new Font(15));
        HBox weekdayPane = new HBox(37);
        Label weekdayLabel = new Label ("Weekdays:");
        Label weekdayExample = new Label ("(Times)");
        weekdayPane.getChildren().add(weekdayLabel);
        weekdayPane.getChildren().add(weekdayExample);

        HBox saturdayPane = new HBox(44);
        Label saturdayLabel = new Label ("Saturday:");
        Label saturdayExample = new Label ("(Times)");
        saturdayPane.getChildren().add(saturdayLabel);
        saturdayPane.getChildren().add(saturdayExample);

        HBox sundayPane = new HBox(52);
        Label sundayLabel = new Label ("Sunday:");
        Label sundayExample = new Label ("(Times)");
        sundayPane.getChildren().add(sundayLabel);
        sundayPane.getChildren().add(sundayExample);

        HBox publicHolidaysPane = new HBox(10);
        Label publicHolidaysLabel = new Label ("Public Holidays:");
        Label publicHolidaysExample = new Label ("(Times)");
        publicHolidaysPane.getChildren().add(publicHolidaysLabel);
        publicHolidaysPane.getChildren().add(publicHolidaysExample);

        timesPane.getChildren().add(timesLabel);
        timesPane.getChildren().add(weekdayPane);
        timesPane.getChildren().add(saturdayPane);
        timesPane.getChildren().add(sundayPane);
        timesPane.getChildren().add(publicHolidaysPane);

        VBox costsPane = new VBox();
        Label costsLabel = new Label("Costs:");
        costsLabel.setFont(new Font(15));
        HBox oneHourPane = new HBox();
        Label oneHourLabel = new Label ("Up to 1 Hour:");
        Label oneHourExample = new Label ("(Cost)");
        oneHourPane.getChildren().add(oneHourLabel);
        oneHourPane.getChildren().add(oneHourExample);

        HBox twoHoursPane = new HBox();
        Label twoHourLabel = new Label ("Up to 2 Hours:");
        Label twoHourExample = new Label ("(Cost)");
        twoHoursPane.getChildren().add(twoHourLabel);
        twoHoursPane.getChildren().add(twoHourExample);

        HBox threeHoursPane = new HBox();
        Label threeHoursLabel = new Label ("Up to 3 Hours:");
        Label threeHoursExample = new Label ("(Costs)");
        threeHoursPane.getChildren().add(threeHoursLabel);
        threeHoursPane.getChildren().add(threeHoursExample);

        HBox fourHoursPane = new HBox();
        Label fourHoursLabel = new Label ("Up to 4 Hours:");
        Label fourHoursExample = new Label ("(Cost)");
        fourHoursPane.getChildren().add(fourHoursLabel);
        fourHoursPane.getChildren().add(fourHoursExample);

        HBox fiveHoursPane = new HBox();
        Label fiveHoursLabel = new Label ("Up to 5 Hours:");
        Label fiveHoursExample = new Label ("(Cost)");
        fiveHoursPane.getChildren().add(fiveHoursLabel);
        fiveHoursPane.getChildren().add(fiveHoursExample);

        HBox overFiveHoursPane = new HBox();
        Label overFiveHoursLabel = new Label ("Over 5 Hours:");
        Label overFiveHoursExample = new Label ("(Cost)");
        overFiveHoursPane.getChildren().add(overFiveHoursLabel);
        fiveHoursPane.getChildren().add(overFiveHoursExample);

        HBox lostTicketPane = new HBox();
        Label  lostTicketLabel= new Label ("Lost ticket:");
        Label lostTicketExample = new Label ("(Cost)");
        lostTicketPane.getChildren().add(lostTicketLabel);
        lostTicketPane.getChildren().add(lostTicketExample);

        costsPane.getChildren().add(costsLabel);
        costsPane.getChildren().add(oneHourPane);
        costsPane.getChildren().add(twoHoursPane);
        costsPane.getChildren().add(threeHoursPane);
        costsPane.getChildren().add(fourHoursPane);
        costsPane.getChildren().add(fiveHoursPane);
        costsPane.getChildren().add(overFiveHoursPane);
        costsPane.getChildren().add(lostTicketPane);

        reviewPane.setPadding(new Insets(0, 0,0,10));
        picPane.setPadding(new Insets(0, 0,0,10));
        addressPane.setPadding(new Insets(0, 0,0,10));
        spacesLabel.setPadding(new Insets(0, 0,0,10));
        payPhoneLane.setPadding(new Insets(0, 0,0,10));
        additionalInfoPane.setPadding(new Insets(0, 0,0,10));
        timesPane.setPadding(new Insets(0, 0,0,10));
        costsPane.setPadding(new Insets(0, 0,0,10));



        rootPane.getChildren().add(titlePane);
        rootPane.getChildren().add(reviewPane);
        rootPane.getChildren().add(picPane);
        rootPane.getChildren().add(addressPane);
        rootPane.getChildren().add(spacesLabel);
        rootPane.getChildren().add(payPhoneLane);
        rootPane.getChildren().add(additionalInfoPane);
        rootPane.getChildren().add(timesPane);
        rootPane.getChildren().add(costsPane);

    }
}