package Controller;

import Models.DatabaseConnection;
import Models.MembershipService;
import Views.CreateReviewPage;
import Views.LoginPage;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

//import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class SignUpPageController {

        public static DatabaseConnection database;
        public static void turnToHash(TextField usernameTextfield, PasswordField passwordField){
            String usernameAsString = usernameTextfield.toString();
            String passwordAsString = passwordField.toString();
            MembershipService.selectMemberById(usernameAsString, passwordAsString, database);
        }
}

