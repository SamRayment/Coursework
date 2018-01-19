package Views;

import Controller.CarParkController;
import Models.*;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;


public class CarPark {

    static Stage parent;

    private int carParkId;

    public CarPark(int carParkId, Stage theParent) {

        Stage stage = new Stage();
        this.carParkId = carParkId;
        parent = theParent;
        parent.hide();
        start(stage);

    }
    public void start(Stage stage)  {
        VBox rootPane = new VBox(5);
        Scene scene = new Scene(rootPane, 280, 448);

        stage.setTitle("Car Park (id: " + this.carParkId + ")");
        stage.setScene(scene);
        stage.show();

        stage.setResizable(false);


        VBox titlePane = new VBox(5);
        HBox picAndTitlePane = new HBox(5);

        titlePane.setStyle("-fx-background-color: #4a86e8ff;");

        Image imageArrow = new Image("Resources/arrow.jpg");
        Button backButton = new Button();
        backButton.setGraphic(new ImageView(imageArrow));
        backButton.setOnAction((ActionEvent e) -> CarParkController.returnStage(stage));
        picAndTitlePane.getChildren().add(backButton);

        Models.CarPark theCarPark = CarParkService.selectById(this.carParkId, SearchPage.database);
        Location carParkLocation = LocationService.carParkLocation(this.carParkId, SearchPage.database);
        TownCounty carParkTownCounty = TownCountyService.findCounty(carParkLocation.getTownCountyId(), SearchPage.database);

        Label titleExample = new Label(theCarPark.getCarParkName());
        titleExample.setStyle("-fx-text-fill: white;");
        titleExample.setFont(new Font( 18));
        picAndTitlePane.getChildren().add(titleExample);

        HBox reviewPane = new HBox(15);
        Label ProblemExample = new Label(theCarPark.getProblems());
        reviewPane.getChildren().add(ProblemExample);

        Hyperlink reviewLink = new Hyperlink();
        reviewLink.setText("View Reviews");
        reviewLink.setOnAction((ActionEvent e) -> CarParkController.openNewStage(theCarPark.getCarParkId(), stage));

        reviewPane.getChildren().add(reviewLink);

        Image cctvImage = new Image("Resources/CCTV.jpg");
        ImageView iv1 = new ImageView(cctvImage);

        Image electricParkingImage = new Image("Resources/Electric Charging.jpg");
        ImageView iv2 = new ImageView(electricParkingImage);

        Image disabledParkingImage = new Image("Resources/Disabled Parking.jpg");
        ImageView iv3 = new ImageView(disabledParkingImage);

        Image childParkingImage = new Image("Resources/Child Parking.jpg");
        ImageView iv4 = new ImageView(childParkingImage);

        HBox picPane = new HBox(10);
        if(carParkLocation.isCctv() == true){
            picPane.getChildren().add(iv1);
        }

        if (carParkLocation.isElectricParking() == true){
            picPane.getChildren().add(iv2);
        }

        if (carParkLocation.isDisabledParking() == true){
            picPane.getChildren().add(iv3);
        }

        if (carParkLocation.isChildParking() == true){
            picPane.getChildren().add(iv4);
        }

        titlePane.getChildren().add(picAndTitlePane);

        ScrollPane scrollPane = new ScrollPane();


        VBox addressPane = new VBox();
        Label roadExample = new Label(carParkLocation.getStreet());
        Label town = new Label (carParkTownCounty.getTown());
        Label county = new Label (carParkTownCounty.getCounty());
        Label postcode = new Label (carParkLocation.getPostcode());

        addressPane.getChildren().add(roadExample);
        addressPane.getChildren().add(town);
        addressPane.getChildren().add(county);
        addressPane.getChildren().add(postcode);

        String noOfSpaces = Integer.toString(theCarPark.getNoOfSpaces());
        VBox additionalInfoPane = new VBox();
        Label spacesLabel = new Label("Number of spaces: "+noOfSpaces);
        Label payPhoneLabel = new Label ("Pay by Phone: "+theCarPark.getPhonePayment());
        additionalInfoPane.getChildren().add(spacesLabel);
        additionalInfoPane.getChildren().add(payPhoneLabel);

        Timetable carParkTimetable = TimetableService.selectById(this.carParkId, SearchPage.database);

        VBox timesPane = new VBox();
        Label timesLabel = new Label("Times open");
        timesLabel.setFont(new Font(15));
        HBox weekdayPane = new HBox(37);
        Label weekdayLabel = new Label ("Weekdays:");
        Label weekdayExample = new Label (carParkTimetable.getWeekdayOpening()+" : "+carParkTimetable.getWeekdayClosing());
        weekdayPane.getChildren().add(weekdayLabel);
        weekdayPane.getChildren().add(weekdayExample);

        HBox saturdayPane = new HBox(44);
        Label saturdayLabel = new Label ("Saturday:");
        Label saturdayExample = new Label (carParkTimetable.getSaturdayOpening()+" : "+carParkTimetable.getSaturdayClosing());
        saturdayPane.getChildren().add(saturdayLabel);
        saturdayPane.getChildren().add(saturdayExample);

        HBox sundayPane = new HBox(52);
        Label sundayLabel = new Label ("Sunday:");
        Label sundayExample = new Label (carParkTimetable.getSundayOpening()+" : "+carParkTimetable.getSundayClosing());
        sundayPane.getChildren().add(sundayLabel);
        sundayPane.getChildren().add(sundayExample);

        HBox publicHolidaysPane = new HBox(10);
        Label publicHolidaysLabel = new Label ("Public Holidays:");
        Label publicHolidaysExample = new Label (carParkTimetable.getPublicHolidayOpening()+" : "+carParkTimetable.getPublicHolidayClosing());
        publicHolidaysPane.getChildren().add(publicHolidaysLabel);
        publicHolidaysPane.getChildren().add(publicHolidaysExample);

        timesPane.getChildren().add(timesLabel);
        timesPane.getChildren().add(weekdayPane);
        timesPane.getChildren().add(saturdayPane);
        timesPane.getChildren().add(sundayPane);
        timesPane.getChildren().add(publicHolidaysPane);

        String costPerHour = Integer.toString(theCarPark.getCostPerHour());
        VBox costsPane = new VBox();
        Label costsLabel = new Label("Cost each hour:");
        HBox  perHourPane = new HBox();
        Label costExample = new Label ("    £"+costPerHour);
        perHourPane.getChildren().add(costsLabel);
        perHourPane.getChildren().add(costExample);

        String lostTicket = Integer.toString(theCarPark.getLostTicket());
        HBox lostTicketPane = new HBox();
        Label  lostTicketLabel= new Label ("Lost ticket:");
        Label lostTicketExample = new Label ("    £"+lostTicket);
        lostTicketPane.getChildren().add(lostTicketLabel);
        lostTicketPane.getChildren().add(lostTicketExample);

        costsPane.getChildren().add(perHourPane);
        costsPane.getChildren().add(lostTicketPane);

        reviewPane.setPadding(new Insets(0, 0,0,10));
        picPane.setPadding(new Insets(0, 0,0,10));
        addressPane.setPadding(new Insets(0, 0,0,10));
        spacesLabel.setPadding(new Insets(0, 0,0,10));
        payPhoneLabel.setPadding(new Insets(0, 0,0,10));
        additionalInfoPane.setPadding(new Insets(0, 0,0,10));
        timesPane.setPadding(new Insets(0, 0,0,10));
        costsPane.setPadding(new Insets(0, 0,0,10));


        rootPane.getChildren().add(titlePane);
        rootPane.getChildren().add(reviewPane);
        rootPane.getChildren().add(picPane);
        rootPane.getChildren().add(addressPane);
        rootPane.getChildren().add(spacesLabel);
        rootPane.getChildren().add(payPhoneLabel);
        rootPane.getChildren().add(additionalInfoPane);
        rootPane.getChildren().add(timesPane);
        rootPane.getChildren().add(costsPane);
        scrollPane.setContent(rootPane);

    }
}