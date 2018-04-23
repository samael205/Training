package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application
{
	ComboBox<String> cbTransport;	
	Label response;
	
	public static void main(String args[])
	{
		// Start the JavaFX Application by calling launch()
		launch(args);
	}
	
	// Override the start() method.
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// Give the stage a title.
		primaryStage.setTitle("Demonstrate Combo Boxes");
		
		// Use a flow pane for the root node. In this case,
		// vertical and horizontal gaps of 10.
		FlowPane flowPane = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		flowPane.setAlignment(Pos.CENTER);
		
		// Create a scene.
		Scene scene = new Scene(flowPane, 280, 120);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// Create a label.
		response = new Label();
	
		// Create an ObservableList of entries for the combo box.
		ObservableList<String> transportTypes = FXCollections.observableArrayList("Train", "Car", "Airplane", "Bicycle", "Walking");
		
		// Create a combo box.
		cbTransport = new ComboBox<>(transportTypes);		
		
		// Set Editable
		cbTransport.setEditable(true);
		
		// Set the default value.
		cbTransport.setValue("Train");
		
		// Set the response label to indicate the default selection.
		response.setText("Selected Transport is : " + cbTransport.getValue());
		
		// Listen for action events on the combo box.
		cbTransport.setOnAction(new EventHandler<ActionEvent>()
		{
			
			@Override
			public void handle(ActionEvent event)
			{
				response.setText("Selected Transport is : " + cbTransport.getValue());
			}
			
		});
		
		// Add the label and combo box to the scene graph.
		flowPane.getChildren().addAll(cbTransport, response);
		
		// Show the stage and its scene.
		primaryStage.show();
	}
		
}
