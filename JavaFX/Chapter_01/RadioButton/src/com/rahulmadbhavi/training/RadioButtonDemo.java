package com.rahulmadbhavi.training;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class RadioButtonDemo extends Application
{

	Label response;
	
	public static void main(String[] args)
	{
		// Start the JavaFX Application by calling launch().
		launch(args);
	}

	// Override the start() method.
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// Give the stage a title.
		primaryStage.setTitle("Demonstrate Radio Button");
		
		// Use a flowPane for the root node. In this case,
		// Vertical and horizontal gaps of 10.
		FlowPane flowPane = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		flowPane.setAlignment(Pos.CENTER);
		
		// Create a scene
		Scene scene = new Scene(flowPane, 400, 120);
		
		// Set the scene on the stage
		primaryStage.setScene(scene);
		
		// Create the label that will report to the selection.
		response = new Label("");
		
		// Create the radio buttons.
		RadioButton rbTrain = new RadioButton("Train");
		RadioButton rbCar = new RadioButton("Car");
		RadioButton rbPlane = new RadioButton("Plane");
		
		// Create a toggle group.
		ToggleGroup toggleGroup = new ToggleGroup();
		
		// Add each button to a toggle group.
		rbTrain.setToggleGroup(toggleGroup);
		rbCar.setToggleGroup(toggleGroup);
		rbPlane.setToggleGroup(toggleGroup);

		ArrayList<RadioButton> radioButtons = new ArrayList<>();
		radioButtons.add(rbTrain);
		radioButtons.add(rbCar);
		radioButtons.add(rbPlane);
		
		// Handle the action events for the radio buttons.
		for(RadioButton radioButton : radioButtons)
		{
			radioButton.setOnAction(new EventHandler<ActionEvent>()
			{
				
				@Override
				public void handle(ActionEvent event)
				{
					response.setText(radioButton.getText() + " was selected.");
				}
				
			});
		}
		
		// Fire the event for the first selection. This causes
		// that radio button to be selected and an action event
		// for that button to occur.
		rbTrain.fire();
		
		// Add the label and buttons to the scene graph.
		flowPane.getChildren().addAll(radioButtons);
		flowPane.getChildren().add(response);
		
		// Show the stage and its scene.
		primaryStage.show();
	}

}
