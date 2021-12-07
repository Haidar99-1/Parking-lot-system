package sample;


import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class clientView{
	private VBox _root;// a global variable that added buttton + label to the root(to VBox)
	Scene scene1,scene2;
	Stage window = Main.getStage();

	public clientView(){ // Contractor
		_root = new VBox(); //initialize VBox
		this.welcome();
		this.setUpButtonReserve();
		this.setUpButtonCheckOut();
		this.changeScene();
		VBox vbox = new VBox();
		// initialize new VBox and pass the varaible vbox into adminView class.
		//this is were I make association
		adminView adminView = new adminView(vbox);
		_root.getChildren().addAll(vbox);
		_root.setAlignment(Pos.CENTER); // center everything in the VBox
	}
	//this method makes a button
	public void setUpButtonReserve(){
		Button reserveButton = new Button("Reserve a spot");
		// the button class has a method setStyle were we can change the color
		reserveButton.setStyle("-fx-background-color: #708090");
		_root.setSpacing(12);
		// add the button into the _root (VBox)
		_root.getChildren().addAll(reserveButton);
	}

	//this method makes a button for check out
	public void setUpButtonCheckOut() {
		Button checkOut = new Button("Check out");
		checkOut.setStyle("-fx-background-color: #708090");
		_root.getChildren().addAll(checkOut);
	}

	public void welcome(){
		//initialize label from Label() class
		Label label = new Label();
		// make the label text bold and large font
		label.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
		label.setText("Welcome Customer!");
		_root.getChildren().add(label);
	}

	public void changeScene(){
		//Button 1

		Button changeWindow = new Button("Click here to admin window");
		changeWindow.setOnAction(e->Main.getStage().setScene(scene2));
		HBox hbox = new HBox();
		hbox.getChildren().add(changeWindow);
		_root.getChildren().add(changeWindow);

		//Button 2
//		Button homePage = new Button("back to client window");
//		homePage.setOnAction(e -> window.setScene();
		VBox secondWindowLayout = new VBox();
		secondWindowLayout.setAlignment(Pos.CENTER);
		Label moneyEarned = new Label("Money Earned: $ 1,000");

		moneyEarned.setTextFill(Color.web("#ff0000"));
		moneyEarned.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));


		Label customerServed = new Label("Customers served: 50");
		customerServed.setTextFill(Color.web("#ff0000"));
		customerServed.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

		secondWindowLayout.getChildren().addAll(moneyEarned,customerServed);
		scene2 = new Scene(secondWindowLayout,600,300);
		
	}


	//get _root and render new changes on Main.java
	//the _root stores all the new button + labels into VBox
	public Pane getRoot() { return _root; }
}
