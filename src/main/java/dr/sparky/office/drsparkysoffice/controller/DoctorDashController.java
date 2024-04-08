package dr.sparky.office.drsparkysoffice.controller;

import dr.sparky.office.drsparkysoffice.util.DataTraveler;
import dr.sparky.office.drsparkysoffice.view.SlideMenuView;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller for the home page of the application.
 * This controller handles user interactions on the home view.
 */
public class DoctorDashController implements Initializable, DataTraveler {

    public ImageView menuImageViewId;
    public Pane rootPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialize the home view and set up event handlers

        // Create the slide menu and buttons
        menuImageViewId.setOnMouseClicked(e -> {
            new SlideMenuView(rootPane).open();
        });
    }

    @Override
    public void data(Object... o) {
        // Implement data transfer functionality if needed
    }

}
