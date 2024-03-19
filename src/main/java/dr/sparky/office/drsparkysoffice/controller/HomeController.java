package dr.sparky.office.drsparkysoffice.controller;

import dr.sparky.office.drsparkysoffice.SparkyApp;
import dr.sparky.office.drsparkysoffice.util.DataTraveler;
import dr.sparky.office.drsparkysoffice.view.SlideMenuView;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable, DataTraveler {

    public ImageView menuImageViewId;
    public Pane rootPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // Create the slide menu and buttons
        menuImageViewId.setOnMouseClicked(e -> {
            new SlideMenuView(rootPane).open();
        });

    }

    @Override
    public void data(Object... o) {

    }

}
