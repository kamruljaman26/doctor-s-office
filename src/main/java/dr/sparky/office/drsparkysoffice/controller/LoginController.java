package dr.sparky.office.drsparkysoffice.controller;

import dr.sparky.office.drsparkysoffice.util.DataTraveler;
import dr.sparky.office.drsparkysoffice.util.FXUtil;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable, DataTraveler {

    public TextField userNameTxtFldID;
    public PasswordField passwordTxtFldID;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    // Move to dashboard
    public void signInButtonAction(ActionEvent actionEvent) {

    }

    @Override
    public void data(Object... o) {

    }


}
