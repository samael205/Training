package com.rahulmadbhavi.training;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CheckBoxDemo extends Application
{
	CheckBox cbWeb;
	CheckBox cbDesktop;
	CheckBox cbMobile;
	ArrayList<CheckBox> checkBoxes;
	
	Label response;
	Label allTargets;
	
	String targets = "";
	
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
		primaryStage.setTitle("Demonstrate Check Boxes");
		
		// Use a flow pane for the root node. In this case,
		// vertical and horizontal gaps of 10.
		FlowPane flowPane = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		flowPane.setAlignment(Pos.CENTER);
		
		// Create a scene.
		Scene scene = new Scene(flowPane, 230, 140);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		Label heading = new Label("Select Deployment Options");
		
		// Create a label that will report the state of the selected check box.
		response = new Label("No Deployment Selected");
		
		// Create a label that will report all the targets selected.
		allTargets = new Label("Target List : <none>");
		
		// Create the check boxes.
		cbWeb = new CheckBox("Web");
		cbDesktop = new CheckBox("Desktop");
		cbMobile = new CheckBox("Mobile");
				
		checkBoxes = new ArrayList<>();
		checkBoxes.add(cbWeb);
		checkBoxes.add(cbDesktop);
		checkBoxes.add(cbMobile);
		
		// Handle action events for the check boxes.
		for(CheckBox checkBox : checkBoxes)
		{
			checkBox.setOnAction(new EventHandler<ActionEvent>()
			{
				
				@Override
				public void handle(ActionEvent event)
				{
					if(checkBox.isSelected())
					{
						response.setText(checkBox.getText() + " deployment selected.");
					}
					else
					{
						response.setText(checkBox.getText() + " deployment cleared.");
					}
					
					showAll();
				}
				
			});
		}
		
		// Use a separator to better organize the layout.
		Separator separator = new Separator();
		separator.setPrefWidth(200);
		
		// Add controls to the scene graph.
		flowPane.getChildren().addAll(heading, separator, cbWeb, cbDesktop, cbMobile, response, allTargets);
		
		// Show the stage and its scene.
		primaryStage.show();
		
	}
	
	// Update and how the tagets list.
	void showAll()
	{
		StringBuilder strb = new StringBuilder("");
		
		for(CheckBox checkBox : checkBoxes)
		{
			if(checkBox.isSelected())
			{
				strb.append(checkBox.getText());
				strb.append(" ");
			}
		}
		
		targets = strb.toString().trim();
		
		if(targets.equals(""))
		{
			targets = "<none>";
		}
		
		allTargets.setText("Target List :  " + targets);
	}
	
}
