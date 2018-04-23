package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DisableControlDemo extends Application
{

	public static void main(String[] args)
	{
		// Start the JavaFX Application by calling launch() method.
		launch(args);
	}
	
	// Override the start() method.
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// Give the stage a title.
		primaryStage.setTitle("Disable Control");
		
		// Use a FlowPane for the root node. In this case,
		// vertical and horizontal gaps of 10 are used.
		FlowPane flowPane = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		flowPane.setAlignment(Pos.CENTER);
		
		// Create a scene
		Scene scene = new Scene(flowPane, 500, 100);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// Add a button
		Button button = new Button("Button");

		// Disable button.
		button.setDisable(true);
		
		// Add button to scene.
		flowPane.getChildren().add(button);
		
		// Show the stage and its scene.
		primaryStage.show();
	}

}
