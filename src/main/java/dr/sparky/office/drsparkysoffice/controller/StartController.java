package dr.sparky.office.drsparkysoffice.controller;

import dr.sparky.office.drsparkysoffice.util.DataTraveler;
import dr.sparky.office.drsparkysoffice.util.FXUtil;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller for the initial screen of the application.
 * This controller handles user interactions on the start view.
 */
public class StartController implements Initializable, DataTraveler {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialize any necessary components or data
    }

    @Override
    public void data(Object... o) {
        // Implement data transfer functionality if needed
    }

    // Move to the patient section
    public void patientButtonAction(ActionEvent actionEvent) {
        commonLogin(actionEvent);
    }

    // Move to the nurse section
    public void nurseButtonAction(ActionEvent actionEvent) {
        commonLogin(actionEvent);
    }

    // Move to the doctor section
    public void doctorButtonAction(ActionEvent actionEvent) {
        commonLogin(actionEvent);
    }

    // Move to the sign-up section
    public void signUpButtonAction(ActionEvent actionEvent) {
        // Hide the current window
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();
        // Load the registration page
        FXUtil.loadView(
                actionEvent,
                FXUtil.REGISTER_PAGE,
                "Create Account"
        );
    }

    // Common method to navigate to the login page
    private void commonLogin(ActionEvent actionEvent){
        // Hide the current window
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();
        // Load the login page
        FXUtil.loadView(
                actionEvent,
                FXUtil.LOGIN_PAGE,
                "Welcome back to the system login."
        );
    }
}
