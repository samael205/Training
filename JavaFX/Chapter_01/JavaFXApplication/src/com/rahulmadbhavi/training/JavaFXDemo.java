package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXDemo extends Application
{
	public static void main(String[] args)
	{
		System.out.println("Launching JavaFX Application");
		
		// Start the JavaFX Application by Calling launch().
		launch(args);
	}
	
	// Override the init() method.
	@Override
	public void init()
	{
		System.out.println("Inside the init() method.");
	}

	@Override
	public void start(Stage myStage) throws Exception
	{
		System.out.println("Inside the start() method.");
		
		// Give the stage a title.
		myStage.setTitle("JavaFX Skeleton");
		
		// Create a root node. In this case, a flow layout pane
		// i used, but several alternatives exist.
		FlowPane rootNode = new FlowPane();
		
		// Create a scene.
		Scene myScene = new  Scene(rootNode, 300, 200);
		
		// Set the scene on the stage.
		myStage .setScene(myScene);
		
		// Show the stage and its scene.
		myStage.show();
	}
	
	// Override the stop method.
	@Override
	public void stop()
	{
		System.out.println("Inside the stop() method.");
	}
}
