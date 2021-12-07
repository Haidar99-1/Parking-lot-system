package sample;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class adminView {
	//in this class we have a new VBox to add a button
	private VBox _adminPane;

	// the constructor takes in one argument which was passed from clientView VBox
	public adminView(VBox adminViewPane){
		_adminPane = adminViewPane; // stores all the new changes in _adminPane
		this.viewAvailability();
		_adminPane.setAlignment(Pos.CENTER); // center everything in this class
		//this.viewAllTransactions();
//		this.viewMoneyEarned();
	}
//
//	public void viewAllTransactions(){
//		Button transactionButton = new Button("Transactions");
//		transactionButton.setStyle("-fx-background-color: #F5F5DC ");
//		_adminPane.setSpacing(15);
//		_adminPane.getChildren().addAll(transactionButton);
//	}

//	public void viewMoneyEarned() {
//		Button MoneyEarned = new Button("Money earned");
//		MoneyEarned.setStyle("-fx-background-color: #7FFFD4 ");
//		_adminPane.getChildren().addAll(MoneyEarned);
//	}
	// a method makes a button of availability spots
	public void viewAvailability() {
		Button Availability = new Button("Availability Spots: 150");
		Availability.setStyle("-fx-background-color: #7FFFD4 ");
		_adminPane.getChildren().addAll(Availability);
	}
}
