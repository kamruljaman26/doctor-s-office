package dr.sparky.office.drsparkysoffice.controller;

import dr.sparky.office.drsparkysoffice.util.DataTraveler;
import dr.sparky.office.drsparkysoffice.util.FXUtil;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController implements Initializable,DataTraveler {

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

    }

    @Override
    public void data(Object... o) {

    }

    // Move to home page
    public void submitButtonAction(ActionEvent actionEvent) {
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();
        FXUtil.loadView(
                actionEvent,
                FXUtil.HOME_PAGE,
                "Doctor App"
        );
    }
}
