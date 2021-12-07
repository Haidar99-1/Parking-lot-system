package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.text.Text;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        clientView organizer = new clientView();
        primaryStage.setScene(new Scene(organizer.getRoot(), 550, 375));
        primaryStage.setTitle("Parking System");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
