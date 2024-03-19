package dr.sparky.office.drsparkysoffice.controller;

import dr.sparky.office.drsparkysoffice.model.Message;
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
import java.util.ResourceBundle;

public class PatientDetailsController implements Initializable, DataTraveler {

    public ImageView backImageViewId;
    public ImageView addImageViewId;
    public Button searchBtnId;
    public TextField searchTxtFldId;
    public ListView<String> patientListViewId;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // init back button
        backImageViewId.setOnMouseClicked(e -> {
            ((Node) e.getSource()).getScene().getWindow().hide();
            FXUtil.loadView(
                    e,
                    FXUtil.HOME_PAGE,
                    "Doctor App"
            );
        });

        // Create an ObservableList with patient names
        ObservableList<String> patients = FXCollections.observableArrayList(
                "John Doe",
                "Jane Smith",
                "Emily Johnson",
                "Michael Brown",
                "Sarah Davis",
                "William Wilson",
                "Jessica Miller",
                "Daniel Taylor",
                "Laura Garcia",
                "James Martinez"
        );

        // Assign the ObservableList to the ListView
        patientListViewId.setItems(patients);
    }

    @Override
    public void data(Object... o) {

    }

}