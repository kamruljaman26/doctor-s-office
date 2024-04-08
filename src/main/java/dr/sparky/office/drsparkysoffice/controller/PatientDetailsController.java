package dr.sparky.office.drsparkysoffice.controller;

import dr.sparky.office.drsparkysoffice.data.PatientManager;
import dr.sparky.office.drsparkysoffice.model.Patient;
import dr.sparky.office.drsparkysoffice.util.DataTraveler;
import dr.sparky.office.drsparkysoffice.util.FXUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
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
public class PatientDetailsController implements Initializable, DataTraveler {

    public ImageView backImageViewId;
    public Button searchBtnId;
    public TextField searchTxtFldId;
    public TableView<Patient> tableViewId;
    public ImageView addImageViewId;
    private PatientManager patientManager;
    private ObservableList<Patient> observablePatients;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        patientManager = new PatientManager();
        observablePatients = FXCollections.observableArrayList(patientManager.getAllPatients());
        tableViewId.setItems(observablePatients);

        // Initialize back button
        backImageViewId.setOnMouseClicked(e -> {
            ((Node) e.getSource()).getScene().getWindow().hide();
            FXUtil.loadView(e, FXUtil.PATIENT_DASH_PAGE, "Doctor App");
        });

        // Initialize search button
        searchBtnId.setOnAction(e -> searchPatient());

        // Initialize add patient button
        addImageViewId.setOnMouseClicked(e -> {
            // Navigate to the add patient page
             FXUtil.loadView(e, FXUtil.PATIENT_ADD_PAGE, "Add New Patient");
//            System.out.println("addImageViewId");
        });

        // Set up table columns
        TableColumn<Patient, String> patientIDColumn = new TableColumn<>("Patient ID");
        patientIDColumn.setCellValueFactory(new PropertyValueFactory<>("patientID"));

        TableColumn<Patient, String> firstNameColumn = new TableColumn<>("First Name");
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn<Patient, String> lastNameColumn = new TableColumn<>("Last Name");
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        // Add columns to table
        tableViewId.getColumns().addAll(patientIDColumn, firstNameColumn, lastNameColumn);
    }

    // Search for patients based on the search text
    private void searchPatient() {
        String searchText = searchTxtFldId.getText().toLowerCase().trim();
        List<Patient> filteredPatients = patientManager.getAllPatients().stream()
                .filter(patient -> patient.getFirstName().toLowerCase().contains(searchText)
                        || patient.getLastName().toLowerCase().contains(searchText)
                        || patient.getEmail().toLowerCase().contains(searchText)
                        || patient.getPhoneNumber().contains(searchText)
                        || patient.getDateOfBirth().contains(searchText))
                .collect(Collectors.toList());
        observablePatients.clear();
        observablePatients.addAll(filteredPatients);
    }

    @Override
    public void data(Object... o) {
        // This method can be used to receive data from other views if needed
    }
}
