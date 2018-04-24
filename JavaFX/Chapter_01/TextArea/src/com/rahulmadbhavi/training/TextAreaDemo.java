
package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TextAreaDemo extends Application
{

	TextArea textAreaInput;
	TextArea textAreaOuptut;
	
	public static void main(String[] args)
	{
		// Start JavaFX Application by running launch().
		launch(args);
	}

	// Override start method.
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// Set title for the application.
		primaryStage.setTitle("Text Area Example");

		// Use a FlowPane for the root node. In this case,
		// vertical and horizontal gaps of 10.
		FlowPane flowPane = new FlowPane(10, 10);

		// Center the controls in the scene.
		flowPane.setAlignment(Pos.CENTER);

		// Create a scene.
		Scene scene = new Scene(flowPane, 500, 400);

		// Set the scene on the stage.
		primaryStage.setScene(scene);

		// Create text areas.
		textAreaInput = new TextArea();
		textAreaOuptut = new TextArea();

		// Set the prompt.
		textAreaInput.setPromptText("Enter Some Text");

		// Set preferred column count.
		textAreaInput.setPrefColumnCount(30);
		textAreaOuptut.setPrefColumnCount(30);

		// Set Output field as non-editable
		textAreaOuptut.setEditable(false);
		
		// Create button
		Button button = new Button("Update");

		// Handle the button action.
		button.setOnAction(area ->
		{
			
			textAreaOuptut.setText(textAreaInput.getText());
			
		});

		// Add controls to the scene graph.
		flowPane.getChildren().addAll(textAreaInput, textAreaOuptut, button);

		// Show the stage and its scene.
		primaryStage.show();
	}

}
