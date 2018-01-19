package Controller;

import Models.Membership;
import Models.MembershipService;
import Views.CreateReviewPage;
import Views.LoginPage;
import Views.SearchPage;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

//import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class SignUpPageController {


        public static void turnToHash(TextField usernameTextfield, PasswordField passwordField, Stage parent, int carParkId){
            String usernameAsString = usernameTextfield.getText();
            System.out.println(usernameAsString);
            String passwordAsString = passwordField.getText();
            String hashedPassword = generateHash(passwordAsString);
            Membership m = new Membership(0, usernameAsString, hashedPassword);
            MembershipService.save(m, SearchPage.database);
            returnLogin(carParkId, parent);

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
        public static void returnLogin(int carParkId, Stage parent){
            LoginPage newStage = new LoginPage(carParkId, parent);
        }
}

