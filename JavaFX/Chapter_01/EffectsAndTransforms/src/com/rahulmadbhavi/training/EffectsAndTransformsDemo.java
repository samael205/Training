package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Glow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class EffectsAndTransformsDemo extends Application
{

	double angle = 0.0;
	double glowVal = 0.0;
	boolean shadow = false;
	double scaleFactor = 1.0;
	
	// Create initial effects and transforms
	Glow glow = new Glow(0.0);
	InnerShadow innerShadow = new InnerShadow(10.0, Color.RED);
	Rotate rotate = new Rotate();
	Scale scale = new Scale(scaleFactor, scaleFactor);
	
	// Create four push buttons.
	Button buttonRotate = new Button("Rotate");
	Button buttonGlow = new Button("Glow");
	Button buttonShadow = new Button("Shadow");
	Button buttonScale = new Button("Scale");
	
	public static void main(String[] args)
	{
		// Start the JavaFX Application by calling launch() method.
		launch(args);
	}
	
	// Override the start method.
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// Give the stage a title.
		primaryStage.setTitle("Effects and Transforms Demo");
		
		// Use a FlowPane for the root node. In this case,
		// vertical and horizontal gaps of 10 are used.
		FlowPane flowPane = new FlowPane(10, 10);
		
		// Center the controls in the scene.
		flowPane.setAlignment(Pos.CENTER);
		
		// Create a scene.
		Scene scene = new Scene(flowPane, 500, 100);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// Set the initial glow effect.
		buttonGlow.setEffect(glow);
		
		// Add rotation to the transform list for the Rotate button.
		buttonRotate.getTransforms().add(rotate);
		
		// Add scaling to the transform list for the Scale button.
		buttonScale.getTransforms().add(scale);
		
		// Handle action events for the rotate button.
		buttonRotate.setOnAction(action ->
		{
			
			// Each time button is pressed, it is rotated 10 degrees
			// around its center.
			angle += 30;
			
			rotate.setAngle(angle);
			rotate.setPivotX(buttonRotate.getWidth() / 2);
			rotate.setPivotY(buttonRotate.getHeight() / 2);
			
		});
		
		// Handle the action events for the scale button.
		buttonScale.setOnAction(action -> 
		{
			
			// Each time button is pressed, the button's scale is changed.
			scaleFactor += 0.1;
			if(scaleFactor > 1.0)
			{
				scaleFactor = 0.5;
			}
			
			scale.setX(scaleFactor);
			scale.setY(scaleFactor);
			
		});
		
		// Handle the action events for the Glow button.
		buttonGlow.setOnAction(action -> 
		{
			
			// Each time button is pressed, its glow value is changed.
			glowVal += 0.1;
			if(glowVal > 1.0)
			{
				glowVal = 0.0;
			}
			
			glow.setLevel(glowVal);
			
		});
		
		// Handle the action events for the shadow button.
		buttonShadow.setOnAction(action -> 
		{
			
			// Each time button is pressed, its shadow status is changed.
			shadow = !shadow;
			
			if(shadow)
			{
				buttonShadow.setEffect(innerShadow);
				buttonShadow.setText("Shadow On");
			}
			else
			{
				buttonShadow.setEffect(null);
				buttonShadow.setText("Shadow Off");
			}
			
		});
		
		// Add the label and buttons to the scene graph.
		flowPane.getChildren().addAll(buttonRotate, buttonScale, buttonGlow, buttonShadow);
		
		// Show the stage and its scene.
		primaryStage.show();
	}

}
