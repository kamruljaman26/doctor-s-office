package dr.sparky.office.drsparkysoffice.util;

import dr.sparky.office.drsparkysoffice.SparkyApp;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXUtil {

    public static final String START_VIEW = "start-view.fxml";
    public static final String LOGIN_PAGE = "login-view.fxml";
    public static final String REGISTER_PAGE = "register-view.fxml";
    public static final String HOME_PAGE = "home-view.fxml";
    public static final String PATIENT_MESSAGE_PAGE = "patient-message-view.fxml";
    public static final String PATIENT_DETAILS_PAGE = "patient-details-view.fxml";

    // load fxml view in the stage, also we can send data between one view to another view
    public static void loadView(Event event, String fxSource, String title, Object... data) {
        try {
            // load fxml
            FXMLLoader loader = new FXMLLoader(SparkyApp.class.getResource(fxSource));
            Parent layout = loader.load();

            // transfer data to the controller
            if (data.length > 0) {
                DataTraveler controller = loader.getController();
                controller.data(data);
            }

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(layout);
            stage.setTitle(title);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

