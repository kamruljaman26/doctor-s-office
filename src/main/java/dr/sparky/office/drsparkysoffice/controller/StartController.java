package dr.sparky.office.drsparkysoffice.controller;

import dr.sparky.office.drsparkysoffice.util.DataTraveler;
import dr.sparky.office.drsparkysoffice.util.FXUtil;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import java.net.URL;
import java.util.ResourceBundle;

public class StartController implements Initializable,DataTraveler {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @Override
    public void data(Object... o) {

    }

    // Move to a patient section
    public void patientButtonAction(ActionEvent actionEvent) {
        commonLogin(actionEvent);
    }

    // Move to a nurse section
    public void nurseButtonAction(ActionEvent actionEvent) {
        commonLogin(actionEvent);
    }

    // Move to a doctor section
    public void doctorButtonAction(ActionEvent actionEvent) {
        commonLogin(actionEvent);
    }

    // Move to a sign-up section
    public void signUpButtonAction(ActionEvent actionEvent) {
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();
        FXUtil.loadView(
                actionEvent,
                FXUtil.REGISTER_PAGE,
                "Create Account"
        );
    }

    private void commonLogin(ActionEvent actionEvent){
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();
        FXUtil.loadView(
                actionEvent,
                FXUtil.LOGIN_PAGE,
                "Welcome back to system login."
        );
    }

}
