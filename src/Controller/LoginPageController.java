package Controller;

import Models.DatabaseConnection;
import Models.Membership;
import Models.MembershipService;
import Views.CreateReviewPage;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class LoginPageController {

    public static DatabaseConnection database;

    public static void turnToHash(TextField usernameTextfield, PasswordField passwordField, Stage stage){

        String usernameAsString = usernameTextfield.getText();
        String passwordAsString = passwordField.getText();
        System.out.println(usernameAsString);
        System.out.println(generateHash(passwordAsString));
        Membership member = MembershipService.selectMemberById(usernameAsString, generateHash(passwordAsString), database);
        //openNewStage(stage);
    }

    public static String generateHash(String passwordAsString) {
   try {
            MessageDigest hasher = MessageDigest.getInstance("MD5");
            hasher.update(passwordAsString.getBytes());
            DatatypeConverter.printHexBinary(hasher.digest()).toUpperCase();
            return DatatypeConverter.printHexBinary(hasher.digest()).toUpperCase();
        } catch (NoSuchAlgorithmException nsae) {
            return nsae.getMessage();
        }
    }

    public static void openNewStage(Stage parent) {
        CreateReviewPage newStage = new CreateReviewPage(parent);
    }

}

