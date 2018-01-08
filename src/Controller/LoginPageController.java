package Controller;

import Models.DatabaseConnection;
import Models.Membership;
import Models.MembershipService;
import Views.CreateReviewPage;
import Views.LoginPage;
import Views.SearchResults;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class LoginPageController {

    static Stage parent;
    public static void turnToHash(TextField usernameTextfield, PasswordField passwordField, Stage parent) {

        String usernameAsString = usernameTextfield.getText();
        String passwordAsString = passwordField.getText();
        String hashedPassword = generateHash(passwordAsString);
        Membership member = MembershipService.selectMemberById(usernameAsString, hashedPassword, SearchResults.database);
        if (member == null) {
            LoginPage error = new LoginPage(parent);
        } else{
            CreateReviewPage newStage = new CreateReviewPage(parent);
        }
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
}

