package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TextFieldDemo extends Application
{

	TextField textField;
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
		// Give the stage a title.
		primaryStage.setTitle("Demontrate a TextField");
		
		// Use a FlowPane for the root node. In this case,
		// vertical and horizontal gaps of 10.
		FlowPane flowPane = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		flowPane.setAlignment(Pos.CENTER);
		
		// Create a scene.
		Scene scene = new Scene(flowPane, 230, 140);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// Create a label that will report the contens of the text field.
		response = new Label("Search String: ");
		
		// Create a button that gets the text.
		Button buttonGetText = new Button("Get Search String");
		
		// Create a text field.
		textField = new TextField();
		
		// Set the prompt.
		textField.setPromptText("Enter Search String");
		
		// Set preferred column count.
		textField.setPrefColumnCount(15);
		
		// Handle action events for the text field. Action
		// events are generated when ENTER is pressed while
		// the text field has input focus. In this case, the
		// text in the field is obtained and displayed.
		textField.setOnAction(new EventHandler<ActionEvent>()
		{
			
			@Override
			public void handle(ActionEvent event)
			{
				response.setText("Search String: " + textField.getText());
			}
			
		});
		
		// Get text from the text field when the button is pressed
		// and display it.
		buttonGetText.setOnAction(new EventHandler<ActionEvent>()
		{

			@Override
			public void handle(ActionEvent event)
			{
				response.setText("Search String: " + textField.getText());
			}			
			
		});
		
		// Use a separator to better organize the layout.
		Separator separator = new Separator();		
		separator.setPrefWidth(180);
		
		// Add controls to the scene graph.
		flowPane.getChildren().addAll(textField, buttonGetText, separator, response);
		
		// Show the stage and its scene.
		primaryStage.show();
	}

}
