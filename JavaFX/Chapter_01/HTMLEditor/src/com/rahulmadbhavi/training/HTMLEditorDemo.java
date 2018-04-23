
package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class HTMLEditorDemo extends Application
{
	private final String INITIAL_TEXT = "Lorem ipsum dolor sit " + "amet, consectetur adipiscing elit. Nam tortor felis, pulvinar " + "in scelerisque cursus, pulvinar at ante. Nulla consequat" + "congue lectus in sodales. Nullam eu est a felis ornare " + "bibendum et nec tellus. Vivamus non metus tempus augue auctor " + "ornare. Duis pulvinar justo ac purus adipiscing pulvinar. " + "Integer congue faucibus dapibus. Integer id nisl ut elit " + "aliquam sagittis gravida eu dolor. Etiam sit amet ipsum " + "sem.";

	public static void main(String[] args)
	{
		// Start JavaFX Application by calling launch() method.
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception
	{
		// Set title.
		stage.setTitle("HTMLEditor Sample");

		// Set Dimensions
		stage.setWidth(500);
		stage.setHeight(500);

		// Create scene
		Scene scene = new Scene(new Group());

		// Define spacing
		VBox root = new VBox();
		root.setPadding(new Insets(8, 8, 8, 8));
		root.setSpacing(5);
		root.setAlignment(Pos.BOTTOM_LEFT);

		// Create Editor
		final HTMLEditor htmlEditor = new HTMLEditor();
		htmlEditor.setPrefHeight(245);
		htmlEditor.setHtmlText(INITIAL_TEXT);

		// Create display text area
		final TextArea htmlCode = new TextArea();
		htmlCode.setWrapText(true);

		// Create scroll pane
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.getStyleClass().add("noborder-scroll-pane");
		scrollPane.setContent(htmlCode);
		scrollPane.setFitToWidth(true);
		scrollPane.setPrefHeight(180);

		// Create Button
		Button showHTMLButton = new Button("Produce HTML Code");
		
		// Set Alignment
		root.setAlignment(Pos.CENTER);
		
		// Create Event Handler
		showHTMLButton.setOnAction(action ->
		{
				htmlCode.setText(htmlEditor.getHtmlText());
		});

		// Add to scene
		root.getChildren().addAll(htmlEditor, showHTMLButton, scrollPane);
		scene.setRoot(root);

		// Add scene to stage
		stage.setScene(scene);
		
		// Display stage
		stage.show();
	}
}
