package com.rahulmadbhavi.training;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
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

		// Use a change listener to a change of selection within
		// the group of radio buttons.
		toggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>()
		{
			
			public void changed(ObservableValue<? extends Toggle> changed, Toggle oldValue, Toggle newValue)
			{
				// Cast new to RadioButton
				RadioButton radioButton = (RadioButton) newValue;
				
				// Display the selection.
				response.setText("Transport selected is " + radioButton.getText());
			}
			
		});
		
		// Select the first button. This will cause a change event
		// on the toggle group.
		rbTrain.setSelected(true);
		
		// Add the label and buttons to the scene graph.
		flowPane.getChildren().addAll(radioButtons);
		flowPane.getChildren().add(response);
		
		// Show the stage and its scene.
		primaryStage.show();
	}

}
