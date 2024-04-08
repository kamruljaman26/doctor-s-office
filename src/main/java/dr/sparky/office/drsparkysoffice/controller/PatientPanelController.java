package dr.sparky.office.drsparkysoffice.controller;

import dr.sparky.office.drsparkysoffice.data.PatientManager;
import dr.sparky.office.drsparkysoffice.model.Patient;
import dr.sparky.office.drsparkysoffice.util.DataTraveler;
import dr.sparky.office.drsparkysoffice.util.FXUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

/**
 * Controller for the patient details page of the application.
 * This controller handles user interactions on the patient details view.
 */
public class PatientPanelController implements Initializable, DataTraveler {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @Override
    public void data(Object... o) {
        // This method can be used to receive data from other views if needed
    }
}
