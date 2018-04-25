package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application
{

	public static void main(String[] args)
	{
		// Start the JavaFX Application by calling the launch() method.
		launch(args);
	}
	
	// Override the start() method.
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// Set a title for the stage.
		primaryStage.setTitle("Hello World");
		
		// Create a button
		Button button = new Button("Hello World");
		
		// Create a stack pane to hold the contents
		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(button);
		
		// Create a scene
		Scene scene = new Scene(stackPane);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// Set scene attributes
		primaryStage.setWidth(800);
		primaryStage.setHeight(600);
		
		// Display the stage.
		primaryStage.show();
	}

}
