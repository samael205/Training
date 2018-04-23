package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class LabelImageDemo extends Application
{

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
		primaryStage.setTitle("Use an Image in a Label");
		
		// Use a FlowPane for the root node.
		FlowPane flowPane = new FlowPane();
		
		// Use center alignment.
		flowPane.setAlignment(Pos.CENTER);
		
		// Create a scene.
		Scene scene = new Scene(flowPane, 960, 720);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// Create an ImageView that contains the specified image.
		ImageView imageView = new ImageView("file:images/charmadi_ghat.jpg");
		
		// Create a label that contains both an image and text.
		Label label = new Label("Charmadi Ghat", imageView);
		
		// Add the label to the scene graph.
		flowPane.getChildren().add(label);
		
		// Show the stage and its scene.
		primaryStage.show();
	}

}
