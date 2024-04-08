package dr.sparky.office.drsparkysoffice.controller;

import java.net.URL;
import java.util.ResourceBundle;

import dr.sparky.office.drsparkysoffice.model.Message;
import dr.sparky.office.drsparkysoffice.util.DataTraveler;
import dr.sparky.office.drsparkysoffice.util.FXUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

/**
 * Controller for the patient message page of the application.
 * This controller handles user interactions on the patient message view.
 */
public class PatientMessageController implements Initializable, DataTraveler {

    public ImageView backImageViewId;
    public Label viewAllPatientsTxtId;
    public TableView<Message> inboxTableViewId;
    private ObservableList<Message> data;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        initTableView();

        // Initialize back button
        backImageViewId.setOnMouseClicked(e -> {
            ((Node) e.getSource()).getScene().getWindow().hide();
            FXUtil.loadView(
                    e,
                    FXUtil.PATIENT_DASH_PAGE,
                    "Doctor App"
            );
        });

        // View all patients
        viewAllPatientsTxtId.setOnMouseClicked(e->{
            ((Node) e.getSource()).getScene().getWindow().hide();
            FXUtil.loadView(
                    e,
                    FXUtil.PATIENT_DETAILS_PAGE,
                    "All Patients"
            );
        });
    }

    private void initTableView() {
        // Initialize TableView with sample data
        data = FXCollections.observableArrayList();
//        data.add(new Message("Carlos Ward", "Some message", "01/31/2024"));
//        data.add(new Message("Johnny Kelly", "Another message", "01/28/2024"));
//        data.add(new Message("Martha Long", "Placeholder message", "01/03/2024"));
//        data.add(new Message("Rachel Willis", "Placeholder message", "01/01/2024"));
//        data.add(new Message("Alex Smith", "Placeholder message", "12/31/2023"));
//        data.add(new Message("Jamie Lane", "Placeholder message", "12/25/2023"));
//        data.add(new Message("Casey Jordan", "Placeholder message", "12/20/2023"));
//        data.add(new Message("Pat Taylor", "Placeholder message", "12/15/2023"));
//        data.add(new Message("Drew Morgan", "Placeholder message", "12/10/2023"));
//        data.add(new Message("Sam Lee", "Placeholder message", "12/05/2023"));
//        data.add(new Message("Chris Doe", "Placeholder message", "11/30/2023"));
//        data.add(new Message("Taylor Bailey", "Placeholder message", "11/25/2023"));

        // Define columns
        TableColumn<Message, String> contactColumn = new TableColumn<>("Contact");
        contactColumn.setCellValueFactory(new PropertyValueFactory<>("contact"));

        TableColumn<Message, String> lastMessageColumn = new TableColumn<>("Last Message");
        lastMessageColumn.setCellValueFactory(new PropertyValueFactory<>("lastMessage"));

        TableColumn<Message, String> dateColumn = new TableColumn<>("Date");
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        // Add columns to table view
        inboxTableViewId.getColumns().add(contactColumn);
        inboxTableViewId.getColumns().add(lastMessageColumn);
        inboxTableViewId.getColumns().add(dateColumn);

        // Set items in the TableView
        inboxTableViewId.setItems(data);

        // Apply CSS styling to the TableView to match the image style
        inboxTableViewId.setStyle("-fx-border-color: grey; -fx-table-cell-border-color: grey;");
        inboxTableViewId.setPrefHeight(10 * 24); // Assuming each row is 24 pixels in height
        inboxTableViewId.refresh();

    }

    @Override
    public void data(Object... o) {
        // Implement data transfer functionality if needed
    }

}