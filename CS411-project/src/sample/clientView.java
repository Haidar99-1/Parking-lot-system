package sample;


import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class clientView{
	private VBox _root;

	public clientView(){
		_root = new VBox();
		this.setUpButtonReserve();
		this.setUpButtonCheckOut();
		VBox vbox = new VBox();
		adminView adminView = new adminView(vbox);
		_root.getChildren().add(vbox);
	}

	public void setUpButtonReserve(){
		Button reserveButton = new Button("Reserve");
		_root.setSpacing(10);
		_root.getChildren().addAll(reserveButton);
	}

	public void setUpButtonCheckOut() {
		Button checkOut = new Button("Check out");
		_root.getChildren().addAll(checkOut);
	}

	public Pane getRoot() { return _root; }
}
