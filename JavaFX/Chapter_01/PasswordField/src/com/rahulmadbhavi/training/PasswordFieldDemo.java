package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class PasswordFieldDemo extends Application
{
	
	Label response;
	PasswordField passwordField;

	public static void main(String[] args)
	{
		// Start the JavaFX Application by calling launch() method.
		launch(args);
	}
	
	// Override the start() method.
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// Give the stage a title.
		primaryStage.setTitle("Demontrate a PasswordField");
		
		// Use a FlowPane for the root node. In this case,
		// vertical and horizontal gaps of 10.
		FlowPane flowPane = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		flowPane.setAlignment(Pos.CENTER);
		
		// Create a scene.
		Scene scene = new Scene(flowPane, 500, 400);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// Create a label that will report the contens of the text field.
		response = new Label("Password: ");
		
		// Create a button that gets the text.
		Button buttonGetPassword = new Button("Update");
		
		// Create a text field.
		passwordField = new PasswordField();

		// Set password desired column size.
		passwordField.setPrefColumnCount(20);
		
		// Button action
		buttonGetPassword.setOnAction(action -> 
		{
			
			response.setText("Password: " + passwordField.getText());
			
		});
				
		// Add controls to the scene graph.
		flowPane.getChildren().addAll(passwordField, buttonGetPassword, response);
		
		// Show the stage and its scene.
		primaryStage.show();
	}

}
