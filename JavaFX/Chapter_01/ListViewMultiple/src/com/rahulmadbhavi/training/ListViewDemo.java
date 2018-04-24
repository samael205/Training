package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListViewDemo extends Application
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
		// Give the stage a title
		primaryStage.setTitle("ListView Multiple Select Demo");
		
		// Use a FlowPane for the root node. In this case,
		// vertical and horizontal gaps of 10.
		FlowPane flowPane = new FlowPane(10, 10);
		
		// center the controls in the scene.
		flowPane.setAlignment(Pos.CENTER);
		
		// Create a scene
		Scene scene = new Scene(flowPane, 200, 300);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// Create a label.
		response = new Label("Select Transport Type");
		
		// Create an Observablelist of entries for the list view.
		ObservableList<String> transportTypes = FXCollections.observableArrayList("Train", "Car", "Airplane", "Bicycle", "Walking");
		
		// Create the list view.
		ListView<String> lvTransport = new ListView<String>(transportTypes);
		
		// Set the preferred width and height.
		lvTransport.setPrefSize(150, 80);
		
		// Get the list view selection model.
		MultipleSelectionModel<String> lvSelModel = lvTransport.getSelectionModel();
		
		// Set multiple select mode
		lvTransport.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		// Use a change listener to respond to a change of selection within a list view.
		lvSelModel.selectedItemProperty().addListener(new ChangeListener<String>()
		{
			
			public void changed(ObservableValue<? extends String> changed, String oldValue, String newValue)			
			{
				String selected = "";
				
				ObservableList<String> selectedList = lvTransport.getSelectionModel().getSelectedItems();
				
				// Display the selections.
				for(String item : selectedList)
				{
					selected += "\n" + item;
				}
				
				response.setText("Selected modes: " + selected);
			}
			
		});
		
		// Add the label and list view to the scene graph.
		flowPane.getChildren().addAll(lvTransport, response);
		
		// Show the stage and its scene.
		primaryStage.show();
	}

}
