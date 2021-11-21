package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        clientView organizer = new clientView();
        primaryStage.setScene(new Scene(organizer.getRoot(), 550, 375));
        primaryStage.setTitle("Parking System");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
