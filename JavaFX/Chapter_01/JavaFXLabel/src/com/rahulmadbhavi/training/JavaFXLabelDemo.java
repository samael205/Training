package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXLabelDemo extends Application
{
	public static void main(String[] args)
	{
		// Start the JavaFX Application by calling launch()
		launch(args);
	}
	
	// Override the start() method.
	@Override
	public void start(Stage stage)
	{
		// Give the stage a title.
		stage.setTitle("Demonstrate a JavaFX Label.");
		
		// Use a FlowPane for the root node.
		FlowPane flowPane = new FlowPane();
		
		// Create a scene.
		Scene scene = new Scene(flowPane, 300, 200);
		
		// Set the scene on the stage.
		stage.setScene(scene);
		
		// Create a label.
		Label label = new Label("This is a JavaFX label.");
		
		// Add the label to the scene graph.
		flowPane.getChildren().add(label);
		
		// Show the scene and its scene.
		stage.show();
	}
}
