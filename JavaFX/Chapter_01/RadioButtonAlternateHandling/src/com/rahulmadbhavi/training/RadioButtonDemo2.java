package com.rahulmadbhavi.training;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class RadioButtonDemo2 extends Application
{

	Label response;
	ToggleGroup toggleGroup;
	
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
		primaryStage.setTitle("Demonstrate Radio Buttons");
		
		// Use a flowPane for the root node. In this case,
		// Vertical and horizontal gaps of 10.
		FlowPane flowPane = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		flowPane.setAlignment(Pos.CENTER);
		
		// Create a scene
		Scene scene = new Scene(flowPane, 350, 140);
		
		// Set the scene on the stage
		primaryStage.setScene(scene);
		
		// Create two labels.
		Label choose = new Label("Select a Transport Type");
		response = new Label("No transport confirmed");
		
		// Create push button used to confirm the selection.
		Button buttonConfirm = new Button("Confirm Transport Selection");
		
		// Create the radio buttons.
		RadioButton rbTrain = new RadioButton("Train");
		RadioButton rbCar = new RadioButton("Car");
		RadioButton rbPlane = new RadioButton("Airplane");
		
		// Create a toggle group.
		ToggleGroup toggleGroup = new ToggleGroup();
		
		// Add each button to a toggle group.
		rbTrain.setToggleGroup(toggleGroup);
		rbCar.setToggleGroup(toggleGroup);
		rbPlane.setToggleGroup(toggleGroup);

		// Initially select one of the radio buttons.
		rbTrain.setSelected(true);
		
		// Handle action events for the confirm button.
		buttonConfirm.setOnAction(new EventHandler<ActionEvent>()
		{
			
			@Override
			public void handle(ActionEvent event)
			{
				// Get the radio button that is currently selected.
				RadioButton radioButton = (RadioButton) toggleGroup.getSelectedToggle();
				
				// Display the selection.
				response.setText(radioButton.getText() + " is confirmed.");
			}
			
		});
		
		// Use a separator to better organize the layout.
		Separator separator = new Separator();
		separator.setPrefWidth(350);	
		
		// Add the label and buttons to the scene graph.
		flowPane.getChildren().addAll(choose, rbTrain, rbCar, rbPlane, separator, buttonConfirm, response);
		
		// Show the stage and its scene.
		primaryStage.show();
	}

}
