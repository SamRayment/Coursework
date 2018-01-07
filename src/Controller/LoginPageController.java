package Controller;

import Models.DatabaseConnection;
import Models.MembershipService;
import Views.CreateReviewPage;
import Views.SearchResults;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static Controller.SearchResultsController.selectToLocate;
//import javax.xml.bind.DatatypeConverter;

public class LoginPageController {

    public static DatabaseConnection database;

    public static void turnToHash(TextField usernameTextfield, PasswordField passwordField, Stage stage){

        String usernameAsString = usernameTextfield.toString();
        String passwordAsString = passwordField.toString();
   //     MembershipService.selectMemberById(usernameAsString, generateHash(passwordAsString), database);
        openNewStage(stage);
    }

    //public static String generateHash(String passwordAsString)
  //  {
    //    try {
    //        MessageDigest hasher = MessageDigest.getInstance("MD5");
    //        hasher.update(passwordAsString.getBytes());
   //         System.out.println(DatatypeConverter.printHexBinary(hasher.digest()).toUpperCase());
    //        return DatatypeConverter.printHexBinary(hasher.digest()).toUpperCase();
    //    } catch (NoSuchAlgorithmException nsae) {
    //        return nsae.getMessage();
    //    }
    //}

    public static void openNewStage(Stage parent) {
        CreateReviewPage newStage = new CreateReviewPage(parent);
    }

}

