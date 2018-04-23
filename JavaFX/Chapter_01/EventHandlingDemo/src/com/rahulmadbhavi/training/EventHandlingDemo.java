package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class EventHandlingDemo extends Application
{
	Label response;
	
	public static void main(String[] args)
	{
		// Start the JavaFX Application by calling launch()
		launch(args);
	}
	
	// Override the start() method
	@Override
	public void start(Stage stage)
	{
		// Give the stage a title.
		stage.setTitle("Demonstrate JavaFX Buttons and Events");
		
		// Use a FlowPane for the root node. In this case,
		// vertical and horizontal gaps of 10.
		FlowPane flowPane = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		flowPane.setAlignment(Pos.CENTER);
		
		// Create a scene.
		Scene scene = new Scene(flowPane, 500, 100);
		
		// Set the scene on the stage.
		stage.setScene(scene);
		
		// Create a label.
		response = new Label("Push a button");
		
		// Create two push buttons.
		Button btnAlpha = new Button("Alpha");
		Button btnBeta = new Button("Beta");
		
		// Handle the action events for the alpha button.
		btnAlpha.setOnAction(new EventHandler<ActionEvent>()
		{
			
			@Override
			public void handle(ActionEvent event)
			{
				response.setText("Alpha was pressed.");
			}
			
		});
		
		// Handle the action events for the beta button.
		btnBeta.setOnAction(new EventHandler<ActionEvent>()
		{
			
			@Override
			public void handle(ActionEvent event)
			{
				response.setText("Beta was pressed.");
			}
			
		});
		
		// Add the label and buttons to the scene graph.
		flowPane.getChildren().addAll(btnAlpha, btnBeta, response);
		
		// Show the stage and its scene.
		stage.show();
		
	}
}
