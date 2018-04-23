package com.rahulmadbhavi.training;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ImageButtonDemo extends Application
{

	Label response;
	
	public static void main(String[] args)
	{
		// Start the JavaFX Application by calling launch().
		launch(args);
	}
	
	public EventHandler<ActionEvent> getEventHandler(String buttonName)
	{
		EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>()
		{
			
			@Override
			public void handle(ActionEvent event)
			{
				response.setText(buttonName + " pressed.");
			}
			
		};
		
		return handler;
	}
	
	// Override the start() method.
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// Give the stage a title.
		primaryStage.setTitle("Use images with Buttons");
		
		// Use a flow pane for the root node. In this case,
		// vertical and horizontal gaps of 10.
		FlowPane flowPane = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		flowPane.setAlignment(Pos.CENTER);
		
		// Create a scene.
		Scene scene = new Scene(flowPane, 600, 600);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// Create a label.
		response = new Label("Push a button");
		
		// Create image based buttons.
		Button buttonAndroid = new Button("Android", new ImageView("file:images/icons/icons8-android-os-48.png"));
		Button buttonApple = new Button("Apple", new ImageView("file:images/icons/icons8-apple-48.png"));
		Button buttonDebian = new Button("Debian", new ImageView("file:images/icons/icons8-debian-48.png"));
		Button buttonFreeBSD = new Button("FreeBSD", new ImageView("file:images/icons/icons8-freebsd-48.png"));
		Button buttonLinux = new Button("Linux", new ImageView("file:images/icons/icons8-linux-48.png"));
		Button buttonWindows = new Button("Win XP", new ImageView("file:images/icons/icons8-windows-xp-48.png"));
		
		ArrayList<Button> buttons = new ArrayList<>();
		buttons.add(buttonAndroid);
		buttons.add(buttonApple);
		buttons.add(buttonDebian);
		buttons.add(buttonFreeBSD);
		buttons.add(buttonLinux);
		buttons.add(buttonWindows);
				
		// Position text and Handle actions
		for(Button button : buttons)
		{
			// Position the text under the image.
			button.setContentDisplay(ContentDisplay.TOP);
			
			// Add Event Handler
			button.setOnAction(getEventHandler(button.getText()));
		}
		
		// Add the label and buttons to the scene graph.
		flowPane.getChildren().add(response);
		flowPane.getChildren().addAll(buttons);
		
		// Show the stage and its scene.
		primaryStage.show();
	}

}
