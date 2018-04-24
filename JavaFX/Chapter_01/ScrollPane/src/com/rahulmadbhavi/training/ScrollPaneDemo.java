
package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ScrollPaneDemo extends Application
{
	ScrollPane scrollPane;

	public static void main(String[] args)
	{
		// Start the JavaFX Application by calling launch().
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// Give the stage a title.
		primaryStage.setTitle("Demonstrate a ScrollPane");
		
		// Use a flow pane for the root node.
		FlowPane flowPane = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		flowPane.setAlignment(Pos.CENTER);
		
		// Create a scene.
		Scene scene = new Scene(flowPane, 200, 200);
				
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// Create a label that will be scrolled.
		Label scrollLabel = new Label("A ScrollPane streamlines the process of\n"
				+ "Adding scroll bars to a window whose\n"
				+ "contents exceed the window's dimensions.\n"
				+ "It also enables a control to fit in a \n"
				+ "smaller space than it otherwise would.\n"
				+ "As such, it often provides a superior\n"
				+ "approach over using individual scroll bars.");
		
		// Create a scroll pane, setting scrollLabel as the content.
		scrollPane = new ScrollPane(scrollLabel);
		
		// Set the viewport width and height.
		scrollPane.setPrefViewportWidth(130);
		scrollPane.setPrefViewportHeight(80);
		
		// Enable panning.
		scrollPane.setPannable(true);
		
		// Create a reset label.
		Button buttonReset = new Button("Reset Scroll Bar Positions");
		
		// Handle action events for the reset button.
		buttonReset.setOnAction(action ->
		{
		
			// Set the scroll bars to their original positions.
			scrollPane.setVvalue(0);
			scrollPane.setHvalue(0);
			
		});
		
		// Add the label to the scene graph.
		flowPane.getChildren().addAll(scrollPane, buttonReset);
		
		// Show the stage and its scene.
		primaryStage.show();
	}

}
