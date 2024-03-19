package dr.sparky.office.drsparkysoffice.controller;

import dr.sparky.office.drsparkysoffice.SparkyApp;
import dr.sparky.office.drsparkysoffice.util.DataTraveler;
import dr.sparky.office.drsparkysoffice.view.SlideMenuView;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable, DataTraveler {


    public ImageView menuImageViewId;
    public Pane rootPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // Create the slide menu and buttons
        SlideMenuView slideMenu = new SlideMenuView(rootPane);

        // handle menu open
        menuImageViewId.setOnMouseClicked(e -> {
            slideMenu.open();
        });

    }

    @Override
    public void data(Object... o) {

    }

}
