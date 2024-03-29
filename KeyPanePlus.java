/*
 *  File: KeyPanePlus.java
 *  Author: Seraphina Morrison
 *  Last modified: 03/28/2024
 */

package javafx;

import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;

public class KeyPanePlus extends KeyPadPane {

	public KeyPanePlus() {
		for (int i = 0; i < listButtons.size(); i++) {
			listButtons.get(i).setStyle("-fx-background-color: #070708; -fx-border-color: #020203; -fx-text-fill: #d8d8f2;"
					+ "-fx-border-width: 0.5px;");
			listButtons.get(i).setOpacity(0.5);
			listButtons.get(i).setFont(Font.font("Lucida Console", 17.5));
			listButtons.get(i).setMinSize(50, 55);
		}
		FlowPane pane = new FlowPane();
		pane.setStyle("-fx-background-color: #222324; -fx-border-color: #111112; -fx-border-width: 5px;");
		pane.getChildren().add(this);
	}
}
