package dr.sparky.office.drsparkysoffice;

import dr.sparky.office.drsparkysoffice.util.FXUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SparkyApp extends Application {

    private FXMLLoader fxmlLoader;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SparkyApp.class.getResource(FXUtil.HOME_VIEW));
        Scene scene = new Scene(fxmlLoader.load(),330 , 640);
        stage.setTitle("Dr Sparky's Office");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}