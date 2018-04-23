package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ImageDemo extends Application
{

	public static void main(String[] args)
	{
		// Start the JavaFX application by calling launch().
		launch(args);
	}
	
	// Override the start() method.
	@Override
	public void start(Stage primaryStage) throws Exception
	{

		// Give the stage a title.
		primaryStage.setTitle("Display an Image");
		
		// Use a FlowPane for the root node.
		FlowPane flowPane = new FlowPane();
		
		// use center alignment.
		flowPane.setAlignment(Pos.CENTER);
		
		// Create a scene.
		Scene scene = new Scene(flowPane, 960, 720);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// Create an image.
		Image image = new Image("file:images/charmadi_ghat.jpg");
		
		// Create an image view that uses the image.
		ImageView imageView = new ImageView(image);
		
		// Add the image to the scene graph
		flowPane.getChildren().add(imageView);
		
		// Show the stage and its scene.
		primaryStage.show();
	}

}
