package dr.sparky.office.drsparkysoffice.controller;

import dr.sparky.office.drsparkysoffice.util.DataTraveler;
import dr.sparky.office.drsparkysoffice.util.FXUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller for the login page of the application.
 * This controller handles user interactions on the login view.
 */
public class LoginController implements Initializable, DataTraveler {

    @FXML
    public TextField userNameTxtFldID;
    public PasswordField passwordTxtFldID;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialize any necessary components or data
    }

    @Override
    public void data(Object... o) {
        // Implement data transfer functionality if needed
    }

    // Method to handle sign in action
    public void signInButtonAction(ActionEvent actionEvent) {



        // Hide the current window
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();
        // Load the home page
        FXUtil.loadView(
                actionEvent,
                FXUtil.PATIENT_DASH_PAGE,
                "Doctor App"
        );
    }
}
