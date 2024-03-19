package dr.sparky.office.drsparkysoffice.view;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;

import static javafx.scene.text.Font.font;

public class SlideMenuView extends VBox {

    private Button patientsMessageBtn;
    private Button patientsDetailsBtn;
    private Button closeMenuBtn;

    public SlideMenuView(Pane pane) {
        configureButtons();
        configureLayout();
        pane.getChildren().addAll(this);
    }

    private void configureButtons() {
        Label title = new Label("Main Menu");
        title.setFont(font("System", FontWeight.BOLD, 24));
        title.setTextFill(Color.WHITE);

        patientsMessageBtn = new Button("Patients Messages");
        patientsDetailsBtn = new Button("Patients Details");
        closeMenuBtn = new Button("Close Menu");

        // Style each button
        String buttonStyle = "-fx-border-color: white; -fx-border-width: 1; -fx-text-fill: white; -fx-background-color: transparent;";
        patientsMessageBtn.setStyle(buttonStyle);
        patientsDetailsBtn.setStyle(buttonStyle);
        closeMenuBtn.setStyle(buttonStyle);

        // Make each button expand to the maximum available width
        patientsMessageBtn.setMaxWidth(Double.MAX_VALUE);
        patientsDetailsBtn.setMaxWidth(Double.MAX_VALUE);
        closeMenuBtn.setMaxWidth(Double.MAX_VALUE);

        getChildren().addAll(title, patientsMessageBtn, patientsDetailsBtn, closeMenuBtn);

        // close menu
        closeMenuBtn.setOnAction(event -> {
            close();
        });
    }

    private void configureLayout() {
        setTranslateX(-200); // start off-screen

        // Set background color to white
        setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));

        // Set fixed height and width
        setPrefHeight(650);
        setPrefWidth(200);

        setPadding(new Insets(20)); // 20 units of padding on all sides
        setSpacing(10);
    }

    public void open() {
        animateSlide(0); // Slide in
    }

    public void close() {
        animateSlide(-200); // Slide out
    }

    private void animateSlide(double toX) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(0.25), this);
        transition.setFromX(getTranslateX());
        transition.setToX(toX);
        transition.play();
    }
}
