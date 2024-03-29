package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.geometry.Insets;


public class PAssign06 extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Variables for iteration populating grid with buttons
		int j = 0, k = 0;
		
		// Create grid and style it
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setStyle("-fx-background-color: #5a5a5e; -fx-border-color: black;");
		pane.setPrefSize(400, 500);
		
		
		// Populate array of buttons
		Button[] buttons = {new Button("1"), new Button("2"),
				new Button("3"), new Button("4"), 
				new Button("5"), new Button("6"),
				new Button("7"), new Button("8"),
				new Button("9"), new Button("*"),
				new Button("0"), new Button("#")
				};
		
		// For loop to populate grid and edit button styles
		for (int i = 0; i < buttons.length; i++) {
			// Sets the style of the buttons
			buttons[i].setStyle("-fx-border-color: #404047; "
					+ "-fx-border-width: 1.5px;"
					+ "-fx-background-color: #7d7d85;");
			buttons[i].setFont(Font.font("Lucida Console", 15));
			buttons[i].setMinSize(40, 45);
			
			// Handles iteration for setting up layout of grid
			if (j == 3) {
				j = 0;
			}
			if (i < 3) {
				j++;
			} else if (i < 6) {
				k = 1;
				j++;
			} else if (i < 9){
				k = 2;
				j++;
			} else {
				k = 3;
				j++;
			}
			//Places buttons in the grid
			pane.add(buttons[i], j, k);
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Phone");
		primaryStage.setHeight(300);
		primaryStage.setWidth(250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

