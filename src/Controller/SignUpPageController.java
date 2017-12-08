package Controller;

import Views.LoginPage;
import javafx.stage.Stage;

import static Views.SignUpPage.createPasswordfield;
import static Views.SignUpPage.createUsernameTextfield;

public class SignUpPageController {

    public static void addNewMember(){
        System.out.println(createUsernameTextfield.getText().toString());
        System.out.println(createPasswordfield.getText().toString());
    }

    public static void openNewStage(Stage parent) {
        LoginPage newStage = new LoginPage(parent);
    }
}
