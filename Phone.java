/*
 *  File: Phone.java
 *  Author: Seraphina Morrison
 *  Last modified: 03/28/2024
 */
package javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Phone extends Pane {
	private Image image1 = new Image("https://i.pinimg.com/564x/26/85/ca/2685ca510a4026fb843a67d5f9ec2cef.jpg");
	private ImageView imageView1 = new ImageView();
	private KeyPanePlus keypad = new KeyPanePlus();
	private StackPane screen1 = new StackPane();
	private VBox vBox = new VBox();
	
	public Phone() {
		// Set the default image size
		imageView1.setFitHeight(95);
		imageView1.setFitWidth(145);
		
		// Set the image
		imageView1.setImage(image1);

		// Create screen
		screen1.setPrefSize(100, 150);
		screen1.setStyle("-fx-background-color: #050505");
		screen1.getChildren().add(imageView1);

		// Style antenna

		// Add all components to VBox
		vBox.getChildren().addAll(screen1, keypad);
		
		// Set margins on components of VBox
		VBox.setMargin(screen1, new Insets(10, 20, 15, 20));
		VBox.setMargin(keypad, new Insets(0, 20, 10, 20));
		
		// Style VBox
		vBox.setStyle("-fx-background-color: #141414;");
		vBox.setBorder(new Border(new BorderStroke(Color.BLACK, 
	            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.FULL)));
		
		// Set VBox in Pane
		this.getChildren().add(vBox);		
	}
}
