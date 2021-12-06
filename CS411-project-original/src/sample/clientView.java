package sample;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;




public class clientView{
	private VBox _root;

	public clientView(){
		_root = new VBox();
		welcome();
//		VBox vBox = new VBox();
//		Label label = new Label("Welcome Customer");
//		vBox.getChildren().add(label);
//		vBox.setAlignment(Pos.CENTER);
		this.setUpButtonReserve();
		this.setUpButtonCheckOut();
		VBox vbox = new VBox();
		adminView adminView = new adminView(vbox);
		_root.getChildren().addAll(vbox);
		_root.setAlignment(Pos.CENTER);

	}

	public void setUpButtonReserve(){
		Button reserveButton = new Button("Reserve a spot");
		reserveButton.setStyle("-fx-background-color: #708090");
		_root.setSpacing(12);
		_root.getChildren().addAll(reserveButton);
	}

	public void setUpButtonCheckOut() {
		Button checkOut = new Button("Check out");
		checkOut.setStyle("-fx-background-color: #708090");
		_root.getChildren().addAll(checkOut);
	}

	public void welcome(){
		Label label = new Label();
		label.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
		label.setText("Welcome Customer!");
		_root.getChildren().add(label);
	}

	public Pane getRoot() { return _root; }
}
