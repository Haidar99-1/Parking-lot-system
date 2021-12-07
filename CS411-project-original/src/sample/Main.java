package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {

    private static Stage window;
    Scene scene1,scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        clientView organizer = new clientView();
        window = primaryStage;
//
//        Button changeWindow = new Button("Change to admin window");
//        changeWindow.setOnAction(e->window.setScene(scene2));
//        VBox vBox = new VBox();
//        vBox.getChildren().add(changeWindow);


        window.setScene(new Scene(organizer.getRoot(), 550, 375));
        window.setTitle("Parking System");

        window.show();
    }

    public static Stage getStage() {
        return window;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
