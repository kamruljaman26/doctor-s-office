package dr.sparky.office.drsparkysoffice.controller;

import dr.sparky.office.drsparkysoffice.util.DataTraveler;
import dr.sparky.office.drsparkysoffice.util.FXUtil;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller for the registration page of the application.
 * This controller handles user interactions on the registration view.
 */
public class RegisterController implements Initializable, DataTraveler {

    public TextField emailTxtFldId;
    public TextField passwordTxtFldId;
    public TextField firstNameTxtFldId;
    public TextField lastNameTxtFldId;
    public TextField dobTxtFldId;
    public TextField phoneTxtFldId;
    public TextField insProviderTxtFldID;
    public TextField emConFNameTxtFldID;
    public TextField emConLNameTxtFldID;
    public TextField emConPhoneTxtFldID;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialize any necessary components or data
    }

    @Override
    public void data(Object... o) {
        // Implement data transfer functionality if needed
    }

    // Submit registration and move to home page
    public void submitButtonAction(ActionEvent actionEvent) {
        // Hide the current window
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();
        // Load the home page
        FXUtil.loadView(
                actionEvent,
                FXUtil.HOME_PAGE,
                "Doctor App"
        );
    }
}
