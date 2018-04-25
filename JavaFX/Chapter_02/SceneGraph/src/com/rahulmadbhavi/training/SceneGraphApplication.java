package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SceneGraphApplication extends Application
{

	public static void main(String[] args)
	{
		// Start the JavaFX Application by calling launch() method.
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// Set title.
		primaryStage.setTitle("Scene Graph Application");
		
		// Set dimensions.
		primaryStage.setWidth(500);
		
		// Create a HBox object
		HBox hBox = new HBox();
		
		// Set Alignment
		hBox.setAlignment(Pos.CENTER);
		
		// Add Buttons to hBox
		hBox.getChildren().add(new Button("Button 1"));
		hBox.getChildren().add(new Button("Button 2"));
		hBox.getChildren().add(new Button("Button 3"));
		
		// Create a VBox object
		VBox vBox = new VBox();
		
		// Add buttons to vBox
		vBox.getChildren().add(new Button("Button 4"));
		vBox.getChildren().add(new Button("Button 5"));
		
		// Add vBox to hBox
		hBox.getChildren().add(vBox);
		
		// Add hBox to scene
		Scene scene = new Scene(hBox);
		
		// Set scene on stage.
		primaryStage.setScene(scene);
		
		// Show stage.
		primaryStage.show();
	}

}
