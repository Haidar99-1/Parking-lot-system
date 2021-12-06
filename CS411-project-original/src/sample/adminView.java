package sample;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class adminView {
	private VBox _adminPane;

	public adminView(VBox adminViewPane){
		_adminPane = adminViewPane;
//		this.viewAllTransactions();
//		this.viewMoneyEarned();
		this.viewAvailability();
		_adminPane.setAlignment(Pos.CENTER);
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

	public void viewAvailability() {
		Button Availability = new Button("Availability Spots: 150");
		Availability.setStyle("-fx-background-color: #7FFFD4 ");
		_adminPane.getChildren().addAll(Availability);
	}
}
