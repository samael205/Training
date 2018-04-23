
package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DirectDrawDemo extends Application
{
	GraphicsContext	graphicsContext;

	Color[]			colors		= { Color.RED, Color.BLUE, Color.GREEN, Color.BLACK };

	int				colorIndex	= 0;

	public static void main(String[] args)
	{
		// Start the JavaFX Application by calling launch().
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// Give the stage a title.
		primaryStage.setTitle("Draw Directly to a Canvas.");

		// Use a FlowPane for the root node.
		FlowPane flowPane = new FlowPane();
		
		// Center the nodes in the scene.
		flowPane.setAlignment(Pos.CENTER);
		
		// Create a Scene
		Scene scene = new Scene(flowPane, 450, 450);
		
		// Set the scene on the stage.
		primaryStage.setScene(scene);
		
		// Create a canvas.
		Canvas canvas = new Canvas(400, 400);
		
		// Get the graphics context for the canvas
		graphicsContext = canvas.getGraphicsContext2D();
		
		// Create a push button.
		Button buttonColorChange = new Button("Change Color");
		
		// Handle the action events for the Change Color button.
		buttonColorChange.setOnAction(new EventHandler<ActionEvent>()
		{
			
			@Override
			public void handle(ActionEvent event)
			{
				// Set the stroke and fill color.
				graphicsContext.setStroke(colors[colorIndex]);
				graphicsContext.setFill(colors[colorIndex]);
				
				// Redraw the line, text, and filled rectangle in the
				// new color. This leaves the color of the other nodes
				// unchanged.
				graphicsContext.strokeLine(0, 0, 200, 200);
				graphicsContext.fillText("This is drawn on the canvas.", 60, 50);
				graphicsContext.fillRect(100, 320, 300, 40);
				
				// Change the color.
				colorIndex++;
				colorIndex %= colors.length;				
			}
			
		});
		
		// Draw initial output on the canvas.
		graphicsContext.strokeLine(0, 0, 200, 200);
		graphicsContext.strokeOval(100, 100, 200, 200);
		graphicsContext.strokeRect(0, 200, 50, 200);
		
		graphicsContext.fillOval(0, 0, 20, 20);
		graphicsContext.fillRect(100, 320, 300, 40);
		
		// Set the font size to 20 and draw text.
		graphicsContext.setFont(new Font(20));
		graphicsContext.fillText("This is drawn on the canvas.", 60, 50);
		
		// Add the canvas and button to the scene graph.
		flowPane.getChildren().addAll(canvas, buttonColorChange);
		
		// Show the stage and its scene.
		primaryStage.show();
	}

}
