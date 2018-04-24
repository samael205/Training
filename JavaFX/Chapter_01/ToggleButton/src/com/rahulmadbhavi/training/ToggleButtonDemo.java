package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ToggleButtonDemo extends Application
{
	
	ToggleButton toggleButton;
	Label response;

	public static void main(String[] args)
	{
		// Start the JavaFX Appliction by calling launch().
		launch(args);
	}
	
	// Override the start() method.
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// Give the stage a title.
		primaryStage.setTitle("Demonstrate a Toggle Button");
		
		// Use a FlowPane for the root node. In this case,
		// vertical and horizontal gaps of 10.
		FlowPane flowPane = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		flowPane.setAlignment(Pos.CENTER);
		
		// Create a scene.
		Scene scene = new Scene(flowPane, 220, 120);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// Create a label.
		response = new Label("Push the button.");
		
		// Create the toggle button.
		toggleButton = new ToggleButton("On/Off");
		
		// Handle action events for the toggle button.
		toggleButton.setOnAction(new EventHandler<ActionEvent>()
		{
			
			@Override
			public void handle(ActionEvent event)
			{
				if(toggleButton.isSelected())
				{
					response.setText("Button is On.");
				}
				else
				{
					response.setText("Button is Off.");
				}
			}
			
		});
		
		// Add the label and buttons to the scene graph.
		flowPane.getChildren().addAll(toggleButton, response);
		
		// Show the stage and its scene.
		primaryStage.show();
	}

}
