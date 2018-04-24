
package com.rahulmadbhavi.training;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TreeViewDemo extends Application
{

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
		primaryStage.setTitle("Demonstrate a TreeView");

		// Use a FlowPane for the root node. In this case,
		// vertical and horizontal gaps of 10.
		FlowPane flowPane = new FlowPane(10, 10);

		// Center the controls in the scene.
		flowPane.setAlignment(Pos.CENTER);

		// Create a scene.
		Scene scene = new Scene(flowPane, 310, 460);

		// Set the scene on the stage.
		primaryStage.setScene(scene);

		// Create a label that will report the state of the selected tree item.
		response = new Label("No Selection");

		// Create tree items, starting with the root.
		// Construct tree
		// Food
		TreeItem<String> tiFood = new TreeItem<String>("Food");

		// Food > Fruit
		TreeItem<String> tiFruit = new TreeItem<String>("Fruit");
		tiFood.getChildren().add(tiFruit);

		// Food > Fruit > Apples
		TreeItem<String> tiApples = new TreeItem<String>("Apples");
		tiFruit.getChildren().add(tiApples);
		
		// Food > Fruit > Apples > ...
		TreeItem<String> tiFuji = new TreeItem<String>("Fuji");
		tiApples.getChildren().add(tiFuji);

		TreeItem<String> tiWinesap = new TreeItem<String>("Winesap");
		tiApples.getChildren().add(tiWinesap);

		TreeItem<String> tiJonathan = new TreeItem<String>("Jonathan");
		tiApples.getChildren().add(tiJonathan);

		// Food > Fruit > Pears
		TreeItem<String> tiPears = new TreeItem<String>("Pears");
		tiFruit.getChildren().add(tiPears);
		
		// Food > Fruit > Oranges
		TreeItem<String> tiOranges = new TreeItem<String>("Oranges");
		tiFruit.getChildren().add(tiOranges);
		
		// Food > Vegetables
		TreeItem<String> tiVegetables = new TreeItem<String>("Vegetables");
		tiFood.getChildren().add(tiVegetables);
		
		// Food > Vegetables > ...
		TreeItem<String> tiCorn = new TreeItem<String>("Corn");
		tiVegetables.getChildren().add(tiCorn);
		
		TreeItem<String> tiPeas = new TreeItem<String>("Peas");
		tiVegetables.getChildren().add(tiPeas);
		
		TreeItem<String> tiBroccoli = new TreeItem<String>("Broccoli");
		tiVegetables.getChildren().add(tiBroccoli);
		
		TreeItem<String> tiBeans = new TreeItem<String>("Beans");
		tiVegetables.getChildren().add(tiBeans);
		
		// Food > Nuts
		TreeItem<String> tiNuts = new TreeItem<String>("Nuts");
		tiFood.getChildren().add(tiNuts);
		
		// Food > Nuts > ...
		TreeItem<String> tiWalnuts = new TreeItem<String>("Walnuts");
		tiNuts.getChildren().add(tiWalnuts);
		
		TreeItem<String> tiPeanuts = new TreeItem<String>("Peanuts");
		tiNuts.getChildren().add(tiPeanuts);
		
		TreeItem<String> tiPecans = new TreeItem<String>("Pecans");
		tiNuts.getChildren().add(tiPecans);
		
		// Create the tree 
		TreeView<String> tvFood = new TreeView<String>(tiFood);
		
		// Get the tree view Selection models.
		MultipleSelectionModel<TreeItem<String>> tvSelModel = tvFood.getSelectionModel();
		
		// Use a change listener to respond to a selection within
		// a tree view.
		tvSelModel.selectedItemProperty().addListener((observable, oldValue, newValue) ->
		{
			
			// Display the selection and its complete and its complete path from the root.
			if(newValue != null)
			{
				// Construct the entire path to the selected item.
				String path = ""; 
						
				path = "/" + newValue.getValue();
				
				TreeItem<String> tmp = newValue.getParent();
				
				while(tmp != null)
				{
					path = "/" + tmp.getValue() + path;

					tmp = tmp.getParent();
				}
				
				// Display the selection and entire path.
				response.setText("Selected Item: " + path);
			}
			
		});
		
		// Add controls to the scene graph.
		flowPane.getChildren().addAll(tvFood, response);
		
		// Show the stage and its scene.
		primaryStage.show();
	}

}
