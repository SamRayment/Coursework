package Controller;

import Models.Membership;
import Models.MembershipService;
import Views.*;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class LoginPageController {

    static Stage parent;
    public static void turnToHash(TextField usernameTextfield, PasswordField passwordField, Stage parent, int carParkId) {

        String usernameAsString = usernameTextfield.getText();
        String passwordAsString = passwordField.getText();
        String hashedPassword = generateHash(passwordAsString);
        Membership member = MembershipService.selectMemberUsernameAndPassword(usernameAsString, hashedPassword, SearchPage.database);
        openCreateReviewPage(member, parent, carParkId);
    }

    public static String generateHash(String passwordAsString) {
   try {
            MessageDigest hasher = MessageDigest.getInstance("MD5"); //(Figure GH1)
            hasher.update(passwordAsString.getBytes()); //(Figure GH2)
            DatatypeConverter.printHexBinary(hasher.digest()).toUpperCase(); //(Figure GH3)
            return DatatypeConverter.printHexBinary(hasher.digest()).toUpperCase(); // (Figure GH4)
        } catch (NoSuchAlgorithmException nsae) { //(Figure GH5)
            return nsae.getMessage(); //(Figure GH6)
        }
    }

    public static void openCreateReviewPage(Membership member, Stage parent, int carParkId){
        if (member == null) {
            LoginPage error = new LoginPage(carParkId, parent);
        } else{
            CreateReviewPage newStage = new CreateReviewPage(carParkId, parent);
        }
    }

    public static void returnStage(int carParkId, Stage parent){
        CarPark returnStage = new CarPark(carParkId, parent);
    }

    public static void linkToSignUp(Stage parent) {
        SignUpPage newStage = new SignUpPage(parent);}
}

